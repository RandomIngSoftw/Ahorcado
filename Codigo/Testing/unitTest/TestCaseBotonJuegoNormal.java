package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Controlador;
import src.ControladorJuegoNormal;
import src.ControladorMenuPrincipal;
import src.Modelo;
import src.Vista;
import src.VistaMenuPrincipal;

public class TestCaseBotonJuegoNormal {

	@Test
	public void BotonJuegoNormal() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciar();
		
		Vista vistaMenuPrincipal = modelo.getVistaActual();	
		modelo.inciarJuegoRelax();
		Vista vistaJuegoNormal = modelo.getVistaActual();
		
		assertNotEquals(vistaMenuPrincipal, vistaJuegoNormal);
	}

}
