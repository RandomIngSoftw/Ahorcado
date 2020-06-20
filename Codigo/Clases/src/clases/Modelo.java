package clases;

public class Modelo {

	private static Modelo modelo = null;
	private Vista vistaActual;
	private Vista vistaAdicional;
	
	/*
	Lector lectorActual;
	JuegoNormal juegoNormal; 
	JuegoRelax juegoRelax; 
	InformacionDelJuego informacionDelJuego: 
	List<> palabrasRelax; 
	Map<> palabrasNormal;
	 */
	
	private Modelo() {}
	
	public static Modelo getInstance(){
		if(modelo == null){
			modelo = new Modelo();
		}
		return modelo;
	}
	
	public void iniciar() {
		vistaActual = (Vista)new VistaMenuPrincipal();
		vistaActual.hacerVisible(true);
	}
	
	public void inciarJuegoRelax(){
		System.out.print("Se inició juego Relax\n");		
	}
	
	public void verTop10(){
		System.out.print("Se inició vetTop10\n");		
	}
	
	public void salirJuego(){
		System.out.print("Se inició salir Juego\n");		
	}

	public void iniciarJuegoNormal() {
		System.out.print("Se inició juego Normal\n");
		vistaActual.hacerVisible(false);
		vistaActual = new VistaJuegoNormal();
		vistaActual.hacerVisible(true);
	}

//---- Juego Normal y Relax ----//	
	public void verEstaditicas() {
		System.out.print("Se inició ver Estaditicas\n");
		vistaAdicional = (Vista)new VistaEstadisticas();
		vistaAdicional.hacerVisible(true);
	}

	public void cerraVentanaEstadisticas() {
		vistaAdicional.hacerVisible(false);
		
	}

// -----------------------------//
	
	public Vista getVistaActual () {
		return vistaActual;
	}
	/*
	public void verEstadisticas(){}
	public void verVistaMenuPrincipal(){}
	public void verPausa(){}
	public void verJuegoPerdido(){}
	public void verJuegoGanado(){}
	public void verGuardarPuntaje(){}
	public void guardarPuntaje(){}
	public void ingresoDeLetra(){}
	public void guardarPalabrasNormal(Map){}
	public void guardarPalabrasRelax(List){}
	
	*/
}
