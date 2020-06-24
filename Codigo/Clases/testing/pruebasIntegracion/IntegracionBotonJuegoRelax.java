package pruebasIntegracion;

import static org.junit.Assert.*;

import org.junit.Test;

import clases.Controlador;
import clases.ControladorMenuPrincipal;
import clases.Modelo;

public class IntegracionBotonJuegoRelax {

	@Test
	public void integracionBotonJuegoRelax() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciarVistaMenuPrincipal();
		
		Controlador controlador = (Controlador)new ControladorMenuPrincipal();
		controlador.juegoRelax();
		
		assertNotNull(modelo.getVistaActual());
	}

}

