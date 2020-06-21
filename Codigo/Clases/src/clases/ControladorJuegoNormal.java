package clases;


public class ControladorJuegoNormal implements Controlador{
	
	private static Modelo modelo;

	public ControladorJuegoNormal() {
		super();
		this.modelo = Modelo.getInstance();
	}

	public void verEstadisticas() {
		modelo.verEstaditicas();
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
	public void cerrarVentana() {
		// TODO Auto-generated method stub
		
	}

	@Override
		public void siguienteNivel() {
			// TODO Auto-generated method stub
			
		}

	@Override
		public void ascender() {
			// TODO Auto-generated method stub
			
		}
}
