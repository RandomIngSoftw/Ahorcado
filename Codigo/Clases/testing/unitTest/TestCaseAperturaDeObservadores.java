package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import clases.Modelo;
import clases.Vista;


public class TestCaseAperturaDeObservadores {
	
	@Test
	public void TestAperturaDeObservadores() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciarVistaMenuPrincipal();
		modelo.iniciarJuegoNormal();
		modelo.verEstaditicas();
		Vista vistaDeEstadisticas = modelo.getVistaAdicional();
		
		assertNotNull(vistaDeEstadisticas);
	}
	
	
	

}
