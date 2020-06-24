package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import clases.Modelo;
import clases.Vista;


public class TestCaseBotonTop10 {

	@Test
	public void test() {
		Modelo modelo = Modelo.getInstance();
		modelo.leerArchivos();
		modelo.iniciarVistaMenuPrincipal();
		
		Vista vistaMenuPrincipal = modelo.getVistaActual();	
		modelo.verTop10();
		Vista vistaTop10 = modelo.getVistaActual();
		
		assertNotEquals(vistaMenuPrincipal, vistaTop10);
	}

}

