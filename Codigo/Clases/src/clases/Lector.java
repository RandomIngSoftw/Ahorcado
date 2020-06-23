package clases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public interface Lector {
    void leerArchivo() throws IOException;
    void guardarLinea(int i, String s);
    ArrayList<String> getLecturaArrayList();
    TreeMap<Integer, String> getLecturaMap();
    TreeMap<Integer, ArrayList<String>> getLecturaMap_I_Array();
    void guardarMapATexto(TreeMap<Integer, String> top10) throws IOException;
}
