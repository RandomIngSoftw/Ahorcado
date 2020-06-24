package pruebasIntegracion;

import static org.junit.Assert.*;

import org.junit.Test;

import clases.Controlador;
import clases.ControladorJuegoNormal;
import clases.Modelo;


public class IntegracionBotonEstadistica {

	@Test
	public void IntegracionBotonEstadisticast() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciarVistaMenuPrincipal();
		
		Controlador controlador = (Controlador)new ControladorJuegoNormal();
		controlador.verEstadisticas();	
		
		assertNotNull(modelo.getVistaAdicional());
	}

}
