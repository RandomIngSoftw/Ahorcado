package clases;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


public class ArchivoPalabrasJuegoRelax implements Lector{
    private ArrayList relax;
    private BufferedReader BR;
    private String Linea;

    ArchivoPalabrasJuegoRelax() throws FileNotFoundException {
        this.relax = new ArrayList();
    }
    
    @Override
    public void leerArchivo() {
        try {
            FileReader arc = new FileReader(".\\src\\palabras.txt");
			BR = new BufferedReader(arc);
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

	@Override
	public TreeMap<Integer, String> getLecturaMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeMap<Integer, ArrayList<String>> getLecturaMap_I_Array() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> getLecturaArrayList() {
		// TODO Auto-generated method stub
		return relax;
	}

	public void guardarMapATexto(TreeMap<Integer, String> top10) throws IOException{}
}
