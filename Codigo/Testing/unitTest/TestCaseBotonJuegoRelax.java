package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Modelo;
import src.Vista;

public class TestCaseBotonJuegoRelax {

	@Test
	public void TestBotonJuegoRelax() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciar();
		
		Vista vistaMenuPrincipal = modelo.getVistaActual();	
		modelo.inciarJuegoRelax();
		Vista vistaJuegoRelax = modelo.getVistaActual();
		
		assertNotEquals(vistaMenuPrincipal, vistaJuegoRelax);
	}

}

