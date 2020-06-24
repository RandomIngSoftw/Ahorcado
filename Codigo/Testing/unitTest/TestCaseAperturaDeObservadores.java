package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Modelo;
import src.Vista;

public class TestCaseAperturaDeObservadores {
	
	@Test
	public void TestAperturaDeObservadores() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciar();
		modelo.iniciarJuegoNormal();
		modelo.verEstaditicas();
		Vista vistaDeEstadisticas = modelo.getVistaAdicional();
		
		assertNotNull(vistaDeEstadisticas);
	}
	
	
	

}
