package clases;

import java.util.ArrayList;


public class JuegoRelax extends Juego {
	
	private ArrayList<String> palabras;
	
	public JuegoRelax(ArrayList<String> palabras) {
		
		super();
//		this.palabras = new ArrayList<String>();
		this.palabras = palabras;
		definirPalabra();
		perder = new DerrotaSinTiempo();
	}
	
	
	public void definirPalabra() {
		
		int i = (int)(Math.random()*palabras.size());
		palabraActual = palabras.get(i);
		palabras.remove(i);
		inicializarAdivinadas();
		letrasErroneas.clear();
		condicionVictoria = false;
		
	}	
	
}
