package clases;

import java.util.ArrayList;
import java.util.TreeMap;

public abstract class Juego {

	protected Boolean condicionVictoria;
	protected int puntaje;
	protected String palabraActual;
	protected int vidas;
	protected int nivel;
	protected ArrayList<String> letrasErroneas;
	protected TreeMap<Integer,String> letrasAdivinadas;
	protected int palabrasEnNivel;
	protected Boolean alcanzoVictoria;
	protected CondicionDerrota perder;
	
	
	public Juego() {
		condicionVictoria = false;
		puntaje = 0;
		vidas = 6;
		nivel = 1;
		palabrasEnNivel = 0;
		alcanzoVictoria = false;
		letrasErroneas = new ArrayList<String>();
		letrasAdivinadas = new TreeMap<Integer,String>();
		
	}
	
	public void inicializarAdivinadas() {
		letrasAdivinadas.clear();
		for ( int i = 0; i < palabraActual.length(); i++) {
			letrasAdivinadas.put( i , "_" );
		}
	}

	public Boolean alcanzoVictoria() {
		return condicionVictoria;
	}
	
	public Boolean logroVictoria() {
		return alcanzoVictoria;
	}
	
	public Boolean alcanzoDerrota() {
		return perder.getCondicionDerrota();
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public int getVidas() {
		return vidas;
	}
	
	public int getNivel() {
		return nivel;
	}
	
	public ArrayList<String> getLetrasErroneas() {
		return letrasErroneas;
	}
	
	public int getPalabrasEnNivel() {
		return palabrasEnNivel;
	}
	
	public TreeMap<Integer, String> getLetrasAdivinadas() {
		return letrasAdivinadas;
	}
	
	public String getPalabraActual() {
		return palabraActual;
	}
	
	public void ingresoLetra(String letra) {
		
		if ( palabraActual.contains(letra) == false) {
			ingresoIncorrecto(letra);
		}
		else {
			ingresoCorrecto(letra);
		}
	}
	
	//Disminuye vidas y mostrar en pantalla
	public void ingresoIncorrecto(String letraIncorrecta){
		vidas--;
		letrasErroneas.add(letraIncorrecta);
		perder.setCondicionDerrotaVidas(vidas);
	
	}
	
	
	//Actualiza palabra a adivinar y realiza calculos de puntaje
	public void ingresoCorrecto(String letraCorrecta) {
		
		if (!letrasAdivinadas.containsValue(letraCorrecta)) {

			for (int i = 0; i < palabraActual.length(); i++) {
				if (letraCorrecta.equals(String.valueOf((palabraActual.charAt(i))))) {
					letrasAdivinadas.put(i, letraCorrecta);
					bonusLetra();
				}
			}
		}
////////////////////////////////////////////////////////////////////////////////////////////////////
		if( !letrasAdivinadas.containsValue("_") ) {
		bonusPalabra();
		if ( vidas == 6 ) {
			bonusPalabra();
		}
		condicionVictoria = true;
		palabrasEnNivel++;
		vidas = 6;
		if ( palabrasEnNivel == 5 ) {
			nivel++;
			palabrasEnNivel = 0;
			if( nivel == 11 ) {
				alcanzoVictoria = true;
			}
		  }
		definirPalabra();
		}
////////////////////////////////////////////////////////////////////////////////////////////////////		
	}
	public void definirPalabra() {
		
	}
	public void bonusLetra() {
		puntaje += 2;
	}

	public void bonusPalabra() {
		switch(nivel) {
		case 1:
			puntaje += 10;
			break;
		case 2:
			puntaje += 15;
			break;
		case 3:
			puntaje += 25;
			break;
		case 4:
			puntaje += 45;
			break;
		case 5:
			puntaje += 75;
			break;
		case 6:
			puntaje += 110;
			break;
		case 7:
			puntaje += 150;
			break;
		case 8:
			puntaje += 210;
			break;
		case 9:
			puntaje += 280;
			break;
		case 10:
			puntaje += 360;
			break;
		default:
			break;
		}
	}
	
	
}
