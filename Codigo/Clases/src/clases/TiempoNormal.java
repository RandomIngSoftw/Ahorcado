package clases;

public class TiempoNormal implements Tiempo {

	private int tiempo;
	public TiempoNormal() {
		tiempo = 30;
	}
	
	@Override
	public int getTiempo() {
		return tiempo;
	}
	@Override
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public void bonusTiempo(int nivel) {
		
	}

}
