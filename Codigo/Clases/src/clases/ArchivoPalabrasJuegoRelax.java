package clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class ArchivoPalabrasJuegoRelax implements Lector{
    private List relax;
    private BufferedReader BR;
    private String Linea;

    ArchivoPalabrasJuegoRelax() throws FileNotFoundException {
        FileReader arc = new FileReader("C:\\palabras.txt");
        this.BR = new BufferedReader(arc);
        this.relax = new ArrayList();
    }
    
    @Override
    public void leerArchivo() {

        try {
            StreamTokenizer st = new StreamTokenizer(BR);
            while (st.nextToken() != StreamTokenizer.TT_EOF) {
            	guardarLinea(0,st.sval);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != BR) {
                	BR.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override
    public void guardarLinea(int puntaje,String palabra) {
        relax.add(palabra);
    }

    public List getRelax(){
        return relax;
    }
}
