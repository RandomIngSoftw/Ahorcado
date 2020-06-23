package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import clases.Modelo;
import clases.Vista;

public class TestCaseBotonJuegoNormal {

	@Test
	public void test() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciarVistaMenuPrincipal();
		
		Vista vistaMenuPrincipal = modelo.getVistaActual();	
		modelo.inciarJuegoRelax();
		Vista vistaJuegoNormal = modelo.getVistaActual();
		
		assertNotEquals(vistaMenuPrincipal, vistaJuegoNormal);
	}

}
