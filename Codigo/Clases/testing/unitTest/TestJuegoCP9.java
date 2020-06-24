package unitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import clases.JuegoRelax;


public class TestJuegoCP9 {

	static ArrayList<String> array;
	static JuegoRelax juego;
	
	
	@BeforeClass
	public static void beforeClass() {
		
		array = new ArrayList<String>();
		array.add("TestCase");
		juego = new JuegoRelax(array);
		juego.ingresoLetra("x");
	}

	@Test
	public void test() {
		
		assertEquals(4,juego.getVidas());
	}
	
	@Test
	public void test2() {
		
		assertEquals("x",juego.getLetrasErroneas().get(0) );
	}

}
