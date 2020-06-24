package unitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;

import clases.JuegoNormal;
import clases.Modelo;
import clases.Vista;

public class TestJuegoCP17 {

	static TreeMap<Integer,ArrayList<String>> map;
	static Modelo modelo = Modelo.getInstance();
	static Vista vista;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		//Modelo modelo = Modelo.getInstance();
		
		map = new TreeMap<Integer,ArrayList<String>>();
		ArrayList<String> array = new ArrayList<String>();
		array.add("TestCase");
		map.put(0, array);
		map.put(1, array);
		modelo.setPalabrasJuegoNormal(map);
		modelo.iniciarVistaMenuPrincipal();
		modelo.iniciarJuegoNormal();
		modelo.iniciar();
		vista = modelo.getVistaActual();

		try {
    		TimeUnit.SECONDS.sleep(31);
    	} catch (InterruptedException e) {
    		e.printStackTrace();
    	}
		
		
	}

	@Test
	public void test() {		
		assertNotEquals(vista,modelo.getVistaTercera());
		
	}
	
	@Test
	public void test2() {
		assertNotEquals(modelo.getVistaTercera(),null);
		
	}

}
