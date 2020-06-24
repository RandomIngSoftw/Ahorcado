package clases;


import java.io.File;

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
