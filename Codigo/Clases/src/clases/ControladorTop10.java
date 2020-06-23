package clases;

public class ControladorTop10 implements Controlador{

	private Modelo modelo;
	
	public ControladorTop10() {
		this.modelo = Modelo.getInstance();
	}
	@Override
	public void juegoNormal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void juegoRelax() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verTop10() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verEstadisticas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cerrarVentana() {
		modelo.cerrarVentanaTop10();
	}
	
	@Override
	public void siguienteNivel() {
		modelo.siguienteNivel();
			
	}
	@Override
		public void ascender(String s) {
			// TODO Auto-generated method stub
			
		}
	public void teclaPresionada(String l) {
		
		}
	@Override
		public void iniciar() {
			
			
		}

}
