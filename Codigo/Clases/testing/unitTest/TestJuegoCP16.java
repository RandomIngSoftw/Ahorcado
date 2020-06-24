package unitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.TreeMap;

import org.junit.BeforeClass;
import org.junit.Test;

import clases.JuegoNormal;

public class TestJuegoCP16 {

	static TreeMap<Integer,ArrayList<String>> map;
	static JuegoNormal juego;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		map = new TreeMap<Integer,ArrayList<String>>();
		ArrayList<String> array = new ArrayList<String>();
		array.add("TestCase");
		map.put(0, array);
		map.put(1, array);
		juego = new JuegoNormal(map);
	}

	@Test
	public void test() {
		assertEquals(1,juego.getNivel());
	}
	
	@Test
	public void test2() {
		assertEquals(0,juego.getPuntaje());
	}
	
	@Test
	public void test3() {
		assertEquals(5,juego.getVidas());
	}
	
	@Test
	public void test4() {
		assertEquals("TestCase",juego.getPalabraActual());
	}
	
	@Test
	public void test5() {
		assertEquals(30,juego.getTiempo());
	}

}
