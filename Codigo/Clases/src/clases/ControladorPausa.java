package clases;

public class ControladorPausa implements Controlador{

	private Modelo modelo;
	
	public ControladorPausa() {
		modelo = Modelo.getInstance();
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
		modelo.cerrarPausa();
		
	}

	@Override
		public void siguienteNivel() {
			modelo.siguientePalabra();
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
