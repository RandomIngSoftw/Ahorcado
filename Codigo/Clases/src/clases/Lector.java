package clases;

import java.io.IOException;

public interface Lector {

    void leerArchivo() throws IOException;
    void guardarLinea(int i, String s);
}
