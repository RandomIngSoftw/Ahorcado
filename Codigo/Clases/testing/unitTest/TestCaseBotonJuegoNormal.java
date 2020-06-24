package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import clases.Modelo;
import clases.Vista;


public class TestCaseBotonJuegoNormal {

	@Test
	public void BotonJuegoNormal() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciarJuegoNormal();
		
		Vista vistaMenuPrincipal = modelo.getVistaActual();	
		modelo.inciarJuegoRelax();
		Vista vistaJuegoNormal = modelo.getVistaActual();
		
		assertNotEquals(vistaMenuPrincipal, vistaJuegoNormal);
	}

}
