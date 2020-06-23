package pruebasIntegracion;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

import clases.Controlador;
import clases.ControladorMenuPrincipal;
import clases.Modelo;

public class IntegracionTop10 {

	@Test
	public void test() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciarVistaMenuPrincipal();
		modelo.leerArchivos();
		
		Controlador controlador = (Controlador)new ControladorMenuPrincipal();
		controlador.verTop10();
		
		assertNotNull(modelo.getVistaActual());
	}

}
