package pruebasIntegracion;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Controlador;
import src.ControladorJuegoNormal;
import src.ControladorMenuPrincipal;
import src.Modelo;
import src.Vista;
import src.VistaMenuPrincipal;

public class IntegracionBotonJuegoNormal {

	@Test
	public void IntegracionBotonJuegoNormal() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciar();
		
		Controlador controlador = (Controlador)new ControladorMenuPrincipal();
		controlador.juegoNormal();
		
		assertNotNull(modelo.getVistaActual());
	}

}
