package clases;

import java.util.ArrayList;
import java.util.TreeMap;

public class InformacionDelJuego implements Sujeto {

	private int puntaje;
	private int vidas;
	private int nivel;
	private int tiempo;
	private TreeMap<Integer, String> letrasAdivinadas;
	private ArrayList<String> letrasErroneas;
	
	private ArrayList<Observador> observadores;
	
	public InformacionDelJuego() {
		letrasAdivinadas = new TreeMap<Integer, String>();
		letrasErroneas = new ArrayList<String>();
		observadores = new ArrayList<Observador>();
	}

	@Override
	public void suscribirObservador(Observador o) {
		// TODO Auto-generated method stub
		observadores.add(o);
	}

	@Override
	public void desuscribirObservador(Observador o) {
		int index = observadores.indexOf(o);
		if (index >= 0) {
			observadores.remove(index);
		}
	}
	
	@Override
	public void avisarObservadores() {
		for(int i = 0; i < observadores.size(); i++ ) {
			Observador observador = (Observador) observadores.get(i);
			observador.actualizar(nivel, puntaje, vidas, letrasErroneas,
					tiempo, letrasAdivinadas);
		}
	}

	
	public TreeMap<Integer, String> getLetrasAdivinadas() {
		return letrasAdivinadas;
	}

	public void setLetrasAdivinadas(TreeMap<Integer, String> letrasAdivinadas) {
		this.letrasAdivinadas = letrasAdivinadas;
	}

	public ArrayList<String> getLetrasErroneas() {
		return letrasErroneas;
	}

	public void setLetrasErroneas(ArrayList<String> letrasErroneas) {
		this.letrasErroneas = letrasErroneas;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public void actualizar(int nivel, int puntaje, int vidas, ArrayList<String> letrasErroneas,
			int tiempo, TreeMap<Integer, String> letrasAdivinadas) {
		setNivel(nivel);
		setPuntaje(puntaje);
		setVidas(vidas);
		setTiempo(tiempo);
		setLetrasAdivinadas(letrasAdivinadas);
		setLetrasErroneas(letrasErroneas);
		
		avisarObservadores();
	}
	
	
}
