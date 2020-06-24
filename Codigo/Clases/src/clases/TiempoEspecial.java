package clases;

public class TiempoEspecial implements Tiempo {

	private int tiempo;
	public TiempoEspecial(int tiempo) {
		this.tiempo = tiempo;
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
		switch(nivel) {
		case 1:
			tiempo += 10;
			break;
		case 2:
			tiempo += 9;
			break;
		case 3:
			tiempo += 8;
			break;
		case 4:
			tiempo += 7;
			break;
		case 5:
			tiempo += 6;
			break;
		case 6:
			tiempo += 5;
			break;
		case 7:
			tiempo += 4;
			break;
		case 8:
			tiempo += 3;
			break;
		case 9:
			tiempo += 2;
			break;
		case 10:
			tiempo += 1;
			break;
		default:
			break;
		}
	}
	
}
