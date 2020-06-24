package unitTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import clases.JuegoRelax;

public class TestJuegoCP11 {

	static ArrayList<String> array;
	static JuegoRelax juego;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		array = new ArrayList<String>();
		array.add("TestCase");
		juego = new JuegoRelax(array);
	}

	@Test
	public void test() {
		juego.ingresoLetra("1");
		assertEquals(4,juego.getVidas());
	}
	
	@Test
	public void test2() {
		juego.ingresoLetra("*");
		assertEquals(3,juego.getVidas());
	}

}
