package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import clases.Modelo;
import clases.Vista;

public class TestCaseBotonJuegoRelax {

	@Test
	public void TestBotonJuegoRelax() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciarVistaMenuPrincipal();
		
		Vista vistaMenuPrincipal = modelo.getVistaActual();	
		modelo.inciarJuegoRelax();
		Vista vistaJuegoRelax = modelo.getVistaActual();
		
		assertNotEquals(vistaMenuPrincipal, vistaJuegoRelax);
	}

}

