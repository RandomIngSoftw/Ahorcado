package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Modelo;
import src.Vista;
import src.VistaMenuPrincipal;

public class TestCaseVentanaMenuPrincipall {

	@Test
	public void ventanaMenuPrincipal() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciar();
		Vista result = modelo.getVistaActual();

		assertNotNull(result);
	}
	
	
}
