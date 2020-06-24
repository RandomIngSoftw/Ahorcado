package clases;

public class DerrotaSinTiempo implements CondicionDerrota {

	private Boolean condicionDerrota;
	
	public DerrotaSinTiempo() {
		condicionDerrota = false;	}

	@Override
	public Boolean getCondicionDerrota() {
		return condicionDerrota;
	}
	
	@Override
	public void setCondicionDerrotaVidas(int vidas) {
		if ( vidas == 0 ) {
			condicionDerrota = true;
		}
	}

	@Override
	public void setCondicionDerrotaTiempo(int tiempo) {
	
	}

}
