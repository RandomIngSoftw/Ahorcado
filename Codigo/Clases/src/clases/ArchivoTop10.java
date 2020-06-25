package clases;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class ArchivoTop10 implements Lector {
    private TreeMap<Integer, String> Top10;
    private BufferedReader BR;
    private FileWriter f;
    private PrintWriter pw;
    
    ArchivoTop10() throws IOException {
        this.Top10 = new TreeMap<Integer, String>();
    }
    
    @Override
    public void guardarLinea(int puntaje, String palabra) {
        Top10.put(puntaje, palabra);
    }

    @Override
    public void guardarMapATexto(TreeMap<Integer, String> top10) throws IOException{
    	try {
			f  = new FileWriter("Top10.txt");
			pw = new PrintWriter(f);
			
			for (Map.Entry<Integer, String> entry : top10.entrySet()) {
					pw.println(""+ entry.getKey() + " " + entry.getValue());
			}
		}
		catch(IOException e){
		}finally {
			pw.close();
			f.close();
		}
    }

    @Override
    public void leerArchivo () throws IOException {
    	try {
    			FileReader arc = new FileReader("Top10.txt");
    			this.BR = new BufferedReader(arc);
    			StreamTokenizer st = new StreamTokenizer(BR);
    			while (st.nextToken() != StreamTokenizer.TT_EOF) {
    				guardarLinea((int)st.nval, st.sval);
            }
        } catch (Exception e) {
        		e.printStackTrace();
        }
    	finally {
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
	public ArrayList<String> getLecturaArrayList() {
		return null;
	}

	@Override
	public TreeMap<Integer, String> getLecturaMap() {
		return Top10;
	}

	@Override
	public TreeMap<Integer, ArrayList<String>> getLecturaMap_I_Array() {
		// TODO Auto-generated method stub
		return null;
	}

}
