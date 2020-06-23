package pruebasIntegracion;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

import clases.Controlador;
import clases.ControladorMenuPrincipal;
import clases.Modelo;

public class IntegracionBotonJuegoNormal {

	@Test
	public void test() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciarVistaMenuPrincipal();
		
		Controlador controlador = (Controlador)new ControladorMenuPrincipal();
		controlador.juegoNormal();;	
		
		assertNotNull(modelo.getVistaAdicional());
	}

}
