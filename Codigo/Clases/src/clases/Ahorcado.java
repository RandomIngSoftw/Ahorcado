package clases;

import java.awt.event.KeyEvent;

public class Ahorcado {
	
	public static void main(String[] args) {
		try {
			Modelo modelo = Modelo.getInstance();
			modelo.leerArchivos();
			modelo.iniciarVistaMenuPrincipal();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
