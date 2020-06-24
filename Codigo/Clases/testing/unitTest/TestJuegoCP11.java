package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.JuegoRelax;

class TestJuegoCP11 {

	static ArrayList<String> array;
	static JuegoRelax juego;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		array = new ArrayList<String>();
		array.add("TestCase");
		juego = new JuegoRelax(array);
	}


	@Test
	void test() {
		juego.ingresoLetra("1");
		assertEquals(4,juego.getVidas());
	}
	
	@Test
	void test2() {
		juego.ingresoLetra("*");
		assertEquals(3,juego.getVidas());
	}

}
