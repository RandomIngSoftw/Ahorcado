package clases;

import java.util.ArrayList;

public class InformacionDelJuego implements Sujeto {

	private int puntaje;
	private int vidas;
	private int nivel;
	private String palabra;
	private String tiempo;
	
	private ArrayList<Observador> observadores;
	
	public InformacionDelJuego() {
		// TODO Auto-generated constructor stub
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
	public void avisarObservadorer() {
		for(int i = 0; i < observadores.size(); i++ ) {
			Observador observador = (Observador) observadores.get(i);
//			observador.actualizar();
		}
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

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}


}
