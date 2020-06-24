package unitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clases.JuegoRelax;

public class TestJuegoCP15 {



	@Test
	public void test() {
		 ArrayList<String> array;
		 JuegoRelax juego;
		array = new ArrayList<String>();
		array.add("a");
		array.add("a");
		array.add("a");
		array.add("a");
		array.add("a");
		array.add("a");
		juego = new JuegoRelax(array);
		
		juego.ingresoLetra("a");
		juego.definirPalabra();
		juego.ingresoLetra("a");
		juego.definirPalabra();
		juego.ingresoLetra("a");
		juego.definirPalabra();
		juego.ingresoLetra("a");
		juego.definirPalabra();
		juego.ingresoLetra("a");
		juego.definirPalabra();
		
		
		assertEquals(2,juego.getNivel());
	}

}
