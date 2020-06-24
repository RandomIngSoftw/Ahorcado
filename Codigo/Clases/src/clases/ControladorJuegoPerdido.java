package clases;

public class ControladorJuegoPerdido implements Controlador{

	private Modelo modelo;
	
	public ControladorJuegoPerdido() {
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
		// TODO Auto-generated method stub
		modelo.cerrarVentanaJuegoPerdido();
	}

	@Override
		public void siguienteNivel() {
			// TODO Auto-generated method stub
			
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
