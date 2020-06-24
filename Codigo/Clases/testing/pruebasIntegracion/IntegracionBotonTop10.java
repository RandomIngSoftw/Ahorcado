package pruebasIntegracion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clases.Controlador;
import clases.ControladorMenuPrincipal;
import clases.Modelo;

public class IntegracionBotonTop10 {

	@Test
	public void IntegracionBotonTop10() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciarVistaMenuPrincipal();
		modelo.leerArchivos();
		
		Controlador controlador = (Controlador)new ControladorMenuPrincipal();
		controlador.verTop10();
		
		assertNotNull(modelo.getVistaActual());
	}

}

