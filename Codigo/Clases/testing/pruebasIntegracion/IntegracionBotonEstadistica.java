package pruebasIntegracion;

import static org.junit.Assert.*;

import org.junit.Test;

import clases.Controlador;
import clases.ControladorMenuPrincipal;
import clases.Modelo;

public class IntegracionBotonEstadistica {

	@Test
	public void test() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciarVistaMenuPrincipal();
		
		Controlador controlador = (Controlador)new ControladorMenuPrincipal();
		controlador.verEstadisticas();	
		
		assertNotNull(modelo.getVistaAdicional());
	}

}
