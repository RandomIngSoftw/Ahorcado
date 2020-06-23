package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import clases.Modelo;
import clases.Vista;

public class TestCaseBotonTop10 {

	@Test
	public void test() {
		Modelo modelo = Modelo.getInstance();
		
		modelo.iniciarVistaMenuPrincipal();
		modelo.leerArchivos();
		modelo.verTop10();
		
		assertNotNull( modelo.getVistaAdicional());
	}

}
