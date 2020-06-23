package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Modelo;

class TestCaseModeloSingleton {

	@Test
	void test() {
		Modelo modelo = Modelo.getInstance();
		Modelo modelo2 = Modelo.getInstance();
		
		assertEquals(modelo, modelo2);
	}

}
