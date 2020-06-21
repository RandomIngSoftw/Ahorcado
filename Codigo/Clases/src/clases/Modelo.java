package clases;

import clases.VistaJuegoRelax;
import clases.VistaTop10;

public class Modelo {

	private static Modelo modelo = null;
	private InformacionDelJuego informacionDelJuego;
	private Vista vistaActual;
	private Vista vistaAdicional;
	private JuegoNormal juegoNormal; 
	private JuegoRelax juegoRelax; 
	private Lector lectorActual;
	
	private Modelo() {
		informacionDelJuego = new InformacionDelJuego();
		vistaActual = null;
		vistaAdicional = null;
	}
	
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
		vistaActual.hacerVisible(false);
		vistaActual = new VistaJuegoRelax(informacionDelJuego);
//		juegoRelax = new JuegoRelax();
		vistaActual.hacerVisible(true);
	}
	
	public void iniciarJuegoNormal() {
		vistaActual.hacerVisible(false);
		vistaActual = new VistaJuegoNormal(informacionDelJuego);
//		juegoNormal = new JuegoNormal();
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
		vistaActual = null;
		iniciarVistaMenuPrincipal();
	}
	
	public void cerrarVentanaJuegoGanado() {
		vistaActual.hacerVisible(false);
		vistaActual = null;
		iniciarVistaMenuPrincipal();
	}
	
	public void verEstaditicas() {
		vistaAdicional = (Vista)new VistaEstadisticas(informacionDelJuego);
		vistaAdicional.hacerVisible(true);
	}

	public void verTop10(){
		System.out.print("Se inició vetTop10\n");		
		vistaActual.hacerVisible(false);
		vistaActual = (Vista)new VistaTop10();
		vistaActual.hacerVisible(true);
	}

	public void verPausa(){
		
	}
	
	public void verJuegoPerdido(){
		
	}
	
	public void verJuegoGanado(){
		
	}
	
	public void verGuardarPuntaje(){
		
	}
	
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

	public void salirJuego() {
		// falta agregar que se escriban los archivos
		vistaActual.hacerVisible(false);
		vistaActual = null;
		vistaAdicional = null;
	}
	
	/*
	public void guardarPuntaje(){}
	public void ingresoDeLetra(){}
	public void guardarPalabrasNormal(Map){}
	public void guardarPalabrasRelax(List){}
	
	*/
}
