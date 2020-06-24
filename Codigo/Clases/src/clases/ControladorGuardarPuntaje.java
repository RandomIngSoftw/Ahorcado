package clases;

public class ControladorGuardarPuntaje implements Controlador{

	private Modelo modelo;
	
	public ControladorGuardarPuntaje() {
		this.modelo = Modelo.getInstance();
	}
	
	@Override
	public void ascender(String name) {
		// TODO Auto-generated method stub
		modelo.ascender(name);
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
		
	}

	@Override
		public void siguienteNivel() {
			// TODO Auto-generated method stub
			
		}

	public void teclaPresionada(String l) {
		
		}

	@Override
		public void iniciar() {
			
			
		}

	

}
