package clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.TreeMap;


public class ArchivoPalabrasJuegoNormal implements Lector {

    private TreeMap<Integer, ArrayList<String>> niveles;
    private BufferedReader BR;

    ArchivoPalabrasJuegoNormal() throws FileNotFoundException {
        this.niveles = new TreeMap<Integer, ArrayList<String>>();
        cargarMap();
    }

    private void cargarMap() {
    	for(int i=1 ; i <= 10 ; i++){
    		niveles.put(i, new ArrayList<String>());
    	}
    }
    
    @Override
    public void leerArchivo() {
        try {

            FileReader arc = new FileReader("palabras.txt");
			this.BR = new BufferedReader(arc);
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

	@Override
	public ArrayList<String> getLecturaArrayList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeMap<Integer, String> getLecturaMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeMap<Integer, ArrayList<String>> getLecturaMap_I_Array() {
		// TODO Auto-generated method stub
		return niveles;
	}

	public void guardarMapATexto(TreeMap<Integer, String> top10) throws IOException{}

}
