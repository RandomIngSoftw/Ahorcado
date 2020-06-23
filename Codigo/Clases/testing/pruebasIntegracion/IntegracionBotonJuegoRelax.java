package pruebasIntegracion;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

import clases.Controlador;
import clases.ControladorMenuPrincipal;
import clases.Juego;
import clases.Modelo;
import clases.Vista;

public class IntegracionBotonJuegoRelax {

	@Test
	public void test() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciarVistaMenuPrincipal();
		
		Controlador controlador = (Controlador)new ControladorMenuPrincipal();
		controlador.juegoRelax();
				
		assertNotNull(modelo.getVistaActual());
	}

}
