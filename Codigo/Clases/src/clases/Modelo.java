package clases;

import clases.VistaJuegoRelax;
import clases.VistaTop10;

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
		iniciarVistaMenuPrincipal();
	}
	
	public void iniciarVistaMenuPrincipal() {
		vistaActual = (Vista)new VistaMenuPrincipal();
		vistaActual.hacerVisible(true);
	}
	
	public void inciarJuegoRelax(){
//		System.out.print("Se inició juego Relax\n");	
		vistaActual.hacerVisible(false);
		vistaActual = new VistaJuegoRelax();
		vistaActual.hacerVisible(true);
	}
	
	public void verTop10(){
		System.out.print("Se inició vetTop10\n");		
		vistaActual.hacerVisible(false);
		vistaActual = (Vista)new VistaTop10();
		vistaActual.hacerVisible(true);
	}
	
	public void cerrarVentanaTop10() {
		vistaActual.hacerVisible(false);
		vistaActual = null;
		iniciarVistaMenuPrincipal();
	}
	
	public void salirJuego(){
//		System.out.print("Adios\n");
		// falta agregar que se escriban los archivos
		vistaActual.hacerVisible(false);
		vistaActual = null;
		vistaAdicional = null;
	}

	public void iniciarJuegoNormal() {
//		System.out.print("Se inició juego Normal\n");
		vistaActual.hacerVisible(false);
		vistaActual = new VistaJuegoNormal();
		vistaActual.hacerVisible(true);
	}

//---- Juego Normal y Relax ----//	
	public void verEstaditicas() {
//		System.out.print("Se inició ver Estaditicas\n");
		vistaAdicional = (Vista)new VistaEstadisticas();
		vistaAdicional.hacerVisible(true);
	}

	public void cerraVentanaEstadisticas() {
		vistaAdicional.hacerVisible(false);
		vistaAdicional = null;
	}

// -----------------------------//
	
	public Vista getVistaActual () {
		return vistaActual;
	}
	
	public Vista getVistaAdicional() {
		return vistaActual;
	}

	public void siguienteNivel() {
	}

	public void ascender() {
		
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
