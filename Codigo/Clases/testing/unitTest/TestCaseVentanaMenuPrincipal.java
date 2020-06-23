package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import clases.Modelo;
import clases.Vista;

public class TestCaseVentanaMenuPrincipal {

	@Test
	public void test() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciarVistaMenuPrincipal();
		Vista result = modelo.getVistaActual();

		assertNotNull(result);
	}

}
