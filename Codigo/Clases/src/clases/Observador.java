package clases;

import java.util.ArrayList;
import java.util.TreeMap;

public interface Observador {

	void actualizar(int nivel, int puntaje, int vidas, ArrayList<String> letrasErroneas, int tiempo,
			TreeMap<Integer, String> letrasAdivinadas);
}
