package pruebasIntegracion;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Controlador;
import src.ControladorMenuPrincipal;
import src.Modelo;
import src.Vista;

public class IntegracionBotonJuegoRelax {

	@Test
	public void IntegracionBotonJuegoRelax() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciar();
		
		Controlador controlador = (Controlador)new ControladorMenuPrincipal();
		controlador.juegoRelax();
		
		assertNotNull(modelo.getVistaActual());
	}

}

