package clases;

//import controladores.*;
//import modelos.Modelo;

public class Ahorcado {
	
	public static void main(String[] args) {
		try {
			Modelo modelo = Modelo.getInstance();
			modelo.iniciar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
}
}
