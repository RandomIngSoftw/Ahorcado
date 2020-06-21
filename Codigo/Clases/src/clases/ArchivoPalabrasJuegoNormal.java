package clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


public class ArchivoPalabrasJuegoNormal implements Lector {

    private TreeMap<Integer, ArrayList> niveles;
    private BufferedReader BR;

    ArchivoPalabrasJuegoNormal() throws FileNotFoundException {
        FileReader arc = new FileReader("C:\\palabras.txt");
        this.niveles = new TreeMap<Integer, ArrayList>();
        this.BR = new BufferedReader(arc);
        cargarMap();
    }

    private void cargarMap() {
    	for(int i=1 ; i <= 10 ; i++){
    		niveles.put(i, new ArrayList<>());
    	}
    }
    
    @Override
    public void leerArchivo() {
        try {
            StreamTokenizer st = new StreamTokenizer(BR);
            while (st.nextToken() != StreamTokenizer.TT_EOF) {
            	guardarLinea(st.sval.length(),st.sval);
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
    public void guardarLinea(int key,String palabra) {
    	if((key-3 <= 10) && (key >= 4)) {
    		niveles.get(key-3).add(palabra);
    	}
    }

    public TreeMap<Integer, ArrayList> getMap(){
        return niveles;
    }

}
