package clases;


public class ControladorMenuPrincipal implements Controlador{

	private static Modelo modelo;

	public ControladorMenuPrincipal() {
		super();
		this.modelo = Modelo.getInstance();
	}

	public void juegoNormal() {
		modelo.iniciarJuegoNormal();
		
	}

	public void juegoRelax() {
		modelo.inciarJuegoRelax();
		
	}

	public void verTop10() {
		modelo.verTop10();
		
	}

	public void salir() {
		modelo.salirJuego();
	}

	@Override
	public void verEstadisticas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cerrarVentana() {
		// TODO Auto-generated method stub
		
	}
	
	
}
