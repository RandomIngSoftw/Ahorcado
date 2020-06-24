package unitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clases.JuegoRelax;

public class TestJuegoCP18 {

	@Test
	public void test() {
		
		ArrayList<String> array	= new ArrayList<String>();
		array.add("TestCase");
		JuegoRelax juego = new JuegoRelax(array);
		juego.ingresoLetra("x");
		juego.ingresoLetra("x");
		juego.ingresoLetra("x");
		juego.ingresoLetra("x");
		juego.ingresoLetra("x");
		
		assertEquals(0,juego.getVidas());
	}

}
