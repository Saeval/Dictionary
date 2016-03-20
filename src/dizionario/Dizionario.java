package dizionario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import dizionario.io.LettoreFile;

public class Dizionario {
	
	private HashMap<String, String> dizionario;
	private ArrayList<String> parole = new ArrayList<String>();
	private ArrayList<String> traduzioni = new ArrayList<String>();
//	private static LettoreFile lettoreFile;
	
	public Dizionario() {
		dizionario = new HashMap<String, String>();
	}
	
	public HashMap<String, String> getDizionario() {
		return dizionario;
	}
	
	public void inizializzaDizionario(LettoreFile lettoreFile) throws IOException {
		lettoreFile.daFileAVariabile(parole, traduzioni);
		for (int i = 0; i < parole.size(); i++) {
			dizionario.put(parole.get(i), traduzioni.get(i));
		}
	}
	
	

}
