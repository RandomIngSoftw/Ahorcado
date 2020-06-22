package clases;


import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;


public class JuegoNormal extends Juego implements Runnable{
	
	private TreeMap<Integer, ArrayList<String>> palabras;
	private Tiempo tiempo;
	private int tiempoTranscurrido;
	Thread hiloTiempo = new Thread(this);

	public JuegoNormal(TreeMap<Integer, ArrayList<String>> palabras) {
		
		super();
		this.palabras = new TreeMap<Integer,ArrayList<String>>();
		this.palabras = palabras;
		tiempo = new TiempoNormal();
		tiempoTranscurrido = 1;
		perder = new DerrotaConTiempo();
		definirPalabra();
		hiloTiempo.start(); 
	}

	public int getTiempo() {
		return tiempo.getTiempo();
	}
	
	public int getTiempoTranscurrido() {
		return tiempoTranscurrido;
	}
	
	public void bonusLetra() {
		puntaje += ( (10*nivel)/tiempoTranscurrido );
		tiempoTranscurrido = 1;
		
	}
	
	public void definirPalabra() {

		ArrayList<String> palabrasNivel = new ArrayList<String>();
		palabrasNivel = palabras.get(nivel);
		
		int i = (int) (Math.random() * palabrasNivel.size());
		palabraActual = palabrasNivel.get(i);
		palabrasNivel.remove(i);
		palabras.put(nivel,palabrasNivel);
		inicializarAdivinadas();
		letrasErroneas.clear();
		condicionVictoria = false;
////////////////////////////////////////////////////////////////////////////////////////////////////
		if ( palabrasEnNivel >= 1 && nivel >= 1 ) {
            hiloTiempo.resume();
            }
////////////////////////////////////////////////////////////////////////////////////////////////////
	}
	
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
////////////////////////////////////////////////////////////////////////////////////////////////////
			hiloTiempo.suspend();
////////////////////////////////////////////////////////////////////////////////////////////////////
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
			if ( palabrasEnNivel == 1 && nivel == 1 ) {
				tiempo = new TiempoEspecial( tiempo.getTiempo() );
			}
			bonusPalabra();
			if ( vidas == 6 ) {
				bonusPalabra();
			}
		}
////////////////////////////////////////////////////////////////////////////////////////////////////		
	}

	public void bonusPalabra() {
		super.bonusPalabra();
		tiempo.bonusTiempo(nivel);
	}
	
	@Override
    public void run() {
        while(condicionVictoria == false){
        long dormir = 1;
        try {
            TimeUnit.SECONDS.sleep(dormir);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tiempo.setTiempo(tiempo.getTiempo()-1);
        tiempoTranscurrido++;
        perder.setCondicionDerrotaTiempo(tiempo.getTiempo());
        }

    }
}
