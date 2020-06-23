package clases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Modelo {

	private static Modelo modelo = null;
	private InformacionDelJuego informacionDelJuego;
	private TreeMap<Integer, String> top10;
	private TreeMap<Integer, ArrayList<String>> palabrasJuegoNormal;
	private ArrayList<String> palabrasJuegoRelax;
	private Vista vistaActual;
	private Vista vistaAdicional;
	private Vista vistatercera;
	private Juego juegoActual;
	private Lector lectorActual;
	private int flag = -1;
	private int puntaje;
	
	public static Modelo getInstance(){
		if(modelo == null){
			modelo = new Modelo();
		}
		return modelo;
	}
	
	private Modelo() {
		informacionDelJuego = new InformacionDelJuego();
		vistaActual = null;
		vistaAdicional = null;
		vistatercera = null;
		juegoActual = null;
		lectorActual = null;
		top10 = new TreeMap<Integer, String>();
		palabrasJuegoNormal = new TreeMap<Integer, ArrayList<String>>();
		palabrasJuegoRelax = new ArrayList<String>();
	}
	
	public void leerArchivos() {
		try {
			lectorActual = (Lector) new ArchivoTop10();
			lectorActual.leerArchivo();
		}catch(IOException e) {
			
		}

		 setTop10(lectorActual.getLecturaMap());
		 lectorActual = null;
		 
		try {
			lectorActual = (Lector) new ArchivoPalabrasJuegoNormal();
			lectorActual.leerArchivo();
		}catch(IOException e) {
				
		}
		setPalabrasJuegoNormal(lectorActual.getLecturaMap_I_Array());
		lectorActual = null;
		try {
			lectorActual = (Lector) new ArchivoPalabrasJuegoRelax();
			lectorActual.leerArchivo();
		}catch(IOException e) {
				
		}
		
		setPalabrasJuegoRelax(lectorActual.getLecturaArrayList());
	}

	private void setPalabrasJuegoNormal(TreeMap<Integer, ArrayList<String>> lecturaMap_I_Array) {
		this.palabrasJuegoNormal = lecturaMap_I_Array;
	}

	private void setPalabrasJuegoRelax(ArrayList<String> arrayList) {
		this.palabrasJuegoRelax = arrayList;
		
	}

	private void setTop10(TreeMap<Integer, String> lecturaMap) {
		this.top10 = lecturaMap;
	}
	
	public void iniciar() {
		if( flag == 2 ) juegoActual = new JuegoRelax(palabrasJuegoRelax);
		if( flag == 1 ) juegoActual = new JuegoNormal(palabrasJuegoNormal);
	
		setInformacionDeJuego();
	}
	
	
	public void iniciarVistaMenuPrincipal() {
		vistaActual = (Vista)new VistaMenuPrincipal();
		vistaActual.hacerVisible(true);
	}
	
	public void inciarJuegoRelax(){
		flag = 2;
		vistaActual.hacerVisible(false);
		vistaActual = new VistaJuegoRelax(informacionDelJuego);
		vistaActual.hacerVisible(true);
	}
	
	public void iniciarJuegoNormal() {
		flag = 1;
		vistaActual.hacerVisible(false);
		vistaActual = new VistaJuegoNormal(informacionDelJuego);
		vistaActual.hacerVisible(true);
	}
	
	public void cerraVentanaEstadisticas() {
		vistaAdicional.hacerVisible(false);
		vistaAdicional = null;
	}
	
	public void cerrarVentanaTop10() {
		vistaActual.hacerVisible(false);
		vistaActual = null;
		iniciarVistaMenuPrincipal();
	}
	
	public void cerrarVentanaJuegoPerdido() {
		vistaActual.hacerVisible(false);
		vistatercera.hacerVisible(false);
		iniciarVistaMenuPrincipal();
	}
	
	public void cerrarVentanaJuegoGanado() {
		vistaActual.hacerVisible(false);
		vistaActual = null;
		iniciarVistaMenuPrincipal();
	}
	
	public void cerrarPausa() {
		vistatercera.hacerVisible(false);
		iniciarVistaMenuPrincipal();
	}
	
	public void verEstaditicas() {
		vistaAdicional = (Vista)new VistaEstadisticas(informacionDelJuego);
		vistaAdicional.hacerVisible(true);
	}

	public void verTop10(){
		vistaActual.hacerVisible(false);
		vistaActual = (Vista)new VistaTop10();
		((VistaTop10) vistaActual).setTop10(top10);
		vistaActual.hacerVisible(true);
	}

	public void verPausa(){
		vistatercera = (Vista) new VistaPausa();
		vistatercera.hacerVisible(true);
	}
	
	public void verJuegoPerdido(){
		vistatercera = (Vista)new VistaJuegoPerdido();
		vistatercera.hacerVisible(true);
	}
	
	public void verJuegoGanado(){
		vistatercera = (Vista)new VistaJuegoGanado();
		vistatercera.hacerVisible(true);
	}
		
	public Vista getVistaActual () {
		return vistaActual;
	}
	
	public Vista getVistaAdicional() {
		return vistaActual;
	}

	public void salirJuego() {
		try {
			lectorActual = (Lector) new ArchivoTop10();
			lectorActual.guardarMapATexto(top10);
			lectorActual = null;
		}catch(IOException e) {}
		
		vistaActual.hacerVisible(false);
		
		if(vistaAdicional != null) vistaAdicional.hacerVisible(false);
		if(vistatercera != null) vistatercera.hacerVisible(false);
			
		vistaActual = null;
		vistaAdicional = null;
		vistatercera = null;
		modelo = null;
	}
	
	public void ingresoDeLetra(String s){
		juegoActual.ingresoLetra(s.toLowerCase());
		// derrota gral
		if(!juegoActual.alcanzoDerrota()) {
			// victoria palabra
			if(!juegoActual.logroVictoria()) {	
				// victoria gral
				if(juegoActual.alcanzoVictoria() ) {
					setInformacionDeJuego();
					verPausa();
				}else {
					setInformacionDeJuego();
				}
			}else {
				setInformacionDeJuego();
				verJuegoGanado();
			}
		}else {
			setInformacionDeJuego();
			juegoActual.interrupThread();
			leerPuntaje();
			if(PuntajeAlto() == 1) pedirNombre();
			else verJuegoPerdido();
		}
	}
	
	private void pedirNombre() {
		vistatercera = (Vista) new VistaGuardarPuntaje();
		vistatercera.hacerVisible(true);
	}
	

	public void ascender(String name) {
		vistatercera.hacerVisible(false);
		top10.put(puntaje, name);
		verTop10();
	}
	
	private int PuntajeAlto() {
		for (Map.Entry<Integer, String> entry : top10.entrySet()) {
			if(  puntaje > entry.getKey() ) {
				return 1;
			}
		}
		return 0;
	}

	private void leerPuntaje() {
		 puntaje = juegoActual.getPuntaje();
	}

	public void setInformacionDeJuego() {
		informacionDelJuego.actualizar( juegoActual.getNivel(),  juegoActual.getPuntaje(),
										juegoActual.getVidas(),	 juegoActual.getLetrasErroneas(),
										juegoActual.getTiempo(), juegoActual.getLetrasAdivinadas(),
										juegoActual.getPalabrasAdivinadas());
	}

	public void siguientePalabra() {
		vistatercera.hacerVisible(false);
		juegoActual.definirPalabra();
		setInformacionDeJuego();
	}
	
}
