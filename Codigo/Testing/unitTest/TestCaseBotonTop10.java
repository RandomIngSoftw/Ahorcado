package unitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import src.Modelo;
import src.Vista;

public class TestCaseBotonTop10 {

	@Test
	public void test() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciar();
		
		Vista vistaMenuPrincipal = modelo.getVistaActual();	
		modelo.verTop10();
		Vista vistaTop10 = modelo.getVistaActual();
		
		assertNotEquals(vistaMenuPrincipal, vistaTop10);
	}

}

