package clases;

public class ControladorDeEstadisiticas implements Controlador{

	private static Modelo modelo;

	public ControladorDeEstadisiticas() {
		super();
		this.modelo = Modelo.getInstance();
	}
	

	@Override
	public void cerrarVentana() {
		modelo.cerraVentanaEstadisticas();
		
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
	public void siguienteNivel() {
		// TODO Auto-generated method stub
		
	}


	public void teclaPresionada(String l) {
		modelo.ingresoDeLetra(l);
		}


	@Override
	public void iniciar() {
		
		
	}


	@Override
		public void ascender(String name) {
			// TODO Auto-generated method stub
			
		}


}
