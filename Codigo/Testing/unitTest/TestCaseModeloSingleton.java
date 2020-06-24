package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Modelo;
import src.Vista;

public class TestCaseModeloSingleton {

	@Test
	public void TestModeloSingleton() {
		Modelo modelo = Modelo.getInstance();
		Modelo modelo2 = Modelo.getInstance();
		
		assertEquals(modelo, modelo2);
	}

}
