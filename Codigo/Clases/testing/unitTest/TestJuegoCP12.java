package unitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import clases.Modelo;

public class TestJuegoCP12 {

	static ArrayList<String> array;
	static Modelo modelo;
	
	@BeforeClass
	public static void beforeClass() {
		modelo = Modelo.getInstance();
		array = new ArrayList<String>();
		array.add("TestCase");
		modelo.setPalabrasJuegoRelax(array);
		modelo.iniciarVistaMenuPrincipal();
		modelo.inciarJuegoRelax();
		modelo.iniciar();
		
		modelo.ingresoDeLetra("A");
	}
	
	@Test
	public void test() {
		assertEquals(5,modelo.getJuegoActual().getVidas());
	}
	
	@Test
	public void test2() {
		assertEquals(2,modelo.getJuegoActual().getPuntaje());
	}

}
