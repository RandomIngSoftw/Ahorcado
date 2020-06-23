package clases;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControladorJuegoGanado implements Controlador{

	private Modelo modelo;
	
	public ControladorJuegoGanado() {
		this.modelo = Modelo.getInstance();
	}
	

	@Override
	public void cerrarVentana() {
		// TODO Auto-generated method stub
		modelo.cerrarVentanaJuegoGanado();
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
		
		}


	@Override
		public void iniciar() {
			
			
		}


	@Override
	public void ascender(String s) {
		// TODO Auto-generated method stub
		
	}



}
