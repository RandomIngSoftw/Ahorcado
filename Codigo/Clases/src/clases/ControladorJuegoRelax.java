package clases;

public class ControladorJuegoRelax implements Controlador{
	
	private static Modelo modelo;

	public ControladorJuegoRelax() {
		super();
		this.modelo = Modelo.getInstance();
	}
	
	@Override
	public void juegoNormal() {}

	@Override
	public void juegoRelax() {}

	@Override
	public void verTop10() {}

	@Override
	public void salir() {}

	@Override
	public void cerrarVentana() {}

	public void verEstadisticas() {
		modelo.verEstaditicas();
	}

	@Override
	public void siguienteNivel() {}

	@Override
	public void ascender(String s) {}

	@Override
	public void teclaPresionada(String l) {
		modelo.ingresoDeLetra(l);
	}

	@Override
	public void iniciar() {
		modelo.iniciar();	
			
	}
}
