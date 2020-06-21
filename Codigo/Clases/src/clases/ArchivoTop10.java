package clases;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ArchivoTop10 implements Lector {
    private TreeMap<Integer, String> Top10;
    private BufferedReader BR;
    private String Linea;

    ArchivoTop10() throws IOException {
        FileReader arc = new FileReader("C:\\top10.txt");
        this.BR = new BufferedReader(arc);
        this.Top10 = new TreeMap<Integer, String>();
    }
    
    @Override
    public void guardarLinea(int puntaje, String palabra) {
        Top10.put(puntaje, palabra);
    }

    public void guardarMapATexto(Map top10){

    }

    @Override
    public void leerArchivo () throws IOException {
    	try {
    			StreamTokenizer st = new StreamTokenizer(BR);
    			while (st.nextToken() != StreamTokenizer.TT_EOF) {
    				guardarLinea((int)st.nval, st.sval);
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

    public TreeMap getMap () {
        return Top10;
    }
}
