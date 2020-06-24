package pruebasIntegracion;

import static org.junit.Assert.*;

import org.junit.Test;

import clases.Controlador;
import clases.ControladorMenuPrincipal;
import clases.Modelo;


public class integracionBotonJuegoNormal {

	@Test
	public void IntegracionBotonJuegoNormal() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciarVistaMenuPrincipal();
		
		Controlador controlador = (Controlador)new ControladorMenuPrincipal();
		controlador.juegoNormal();
		
		assertNotNull(modelo.getVistaActual());
	}

}
