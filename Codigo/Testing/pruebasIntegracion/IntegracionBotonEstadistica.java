package pruebasIntegracion;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Controlador;
import src.ControladorJuegoNormal;
import src.ControladorMenuPrincipal;
import src.Modelo;

public class IntegracionBotonEstadistica {

	@Test
	public void IntegracionBotonEstadisticast() {
		Modelo modelo = Modelo.getInstance();
		modelo.iniciar();
		
		Controlador controlador = (Controlador)new ControladorJuegoNormal();
		controlador.verEstadisticas();	
		
		assertNotNull(modelo.getVistaAdicional());
	}

}
