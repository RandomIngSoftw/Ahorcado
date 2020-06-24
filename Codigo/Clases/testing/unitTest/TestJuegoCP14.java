package unitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.TreeMap;

import org.junit.BeforeClass;
import org.junit.Test;

import clases.JuegoNormal;

public class TestJuegoCP14 {

	static TreeMap<Integer,ArrayList<String>> map;
	static JuegoNormal juego;
	static int tiempo;
	static int puntaje;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		map = new TreeMap<Integer,ArrayList<String>>();
		ArrayList<String> array = new ArrayList<String>();
		array.add("TestCase");
		map.put(0, array);
		map.put(1, array);
		juego = new JuegoNormal(map);
		juego.ingresoLetra("T");
		juego.ingresoLetra("e");
		juego.ingresoLetra("s");
		juego.ingresoLetra("t");
		juego.ingresoLetra("C");
		puntaje = juego.getPuntaje(); //70
		tiempo = juego.getTiempo(); //30
		juego.ingresoLetra("a");
	}
	
	@Test
	public void test() {
		assertNotEquals(puntaje,juego.getPuntaje());
	}

	@Test
	public void test2() {
		assertNotEquals(tiempo,juego.getTiempo());
	}
	
	@Test
	public void test3() {
		assertEquals(100,juego.getPuntaje());
	}
	
	@Test
	public void test4() {
		assertEquals(50,juego.getTiempo());
	}


}
