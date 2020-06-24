package clases;

public class DerrotaConTiempo implements CondicionDerrota {
	
	private Boolean condicionDerrota;
	
	public DerrotaConTiempo() {
		condicionDerrota = false;
	}
	
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
		if ( tiempo == 0 ) {
			condicionDerrota = true;
		}
		
	}

}
