package unitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import clases.JuegoRelax;


public class TestJuegoCP10 {
	
	static ArrayList<String> array;
	static JuegoRelax juego;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		array = new ArrayList<String>();
		array.add("TestCase");
		juego = new JuegoRelax(array);
		juego.ingresoLetra("e");
	}

	
	@Test
	public void test() {
		
		assertEquals(5,juego.getVidas());
	}
	
	@Test
	public void test2() {
		
		assertEquals(4,juego.getPuntaje());
	}
	
	@Test
	public void test3() {
		
		assertEquals("e",juego.getLetrasAdivinadas().get(1) );
	}
	
	@Test
	public void test4() {
		
		assertEquals("e",juego.getLetrasAdivinadas().get(7) );
	}

	@Test
	public void test5() {
		
		assertEquals(false,juego.alcanzoDerrota() );
	}
	
	@Test
	public void test6() {
		
		assertEquals(false,juego.alcanzoVictoria() );
	}
	
	@Test
	public void test7() {
		
		assertEquals(false,juego.logroVictoria() );
	}
	
	@Test
	public void test8() {
		
		assertEquals(1,juego.getNivel() );
	}

}
