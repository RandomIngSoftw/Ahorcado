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

	public void teclaPresionada(String l) {
		modelo.ingresoDeLetra(l);
		}

	@Override
	public void iniciar() {
		modelo.iniciar();	
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

	@Override
	public void siguienteNivel() {}

	@Override
	public void ascender(String s) {}

	
}
