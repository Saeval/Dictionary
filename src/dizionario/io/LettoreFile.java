package dizionario.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LettoreFile{
	
	private static LettoreFile unicoLettore = new LettoreFile();
	
	private LettoreFile(){};
	
	public static LettoreFile getUnicoLettore(){
		return unicoLettore;
	}
	
	private String filename;
	
//	public LettoreFile() {
//		setFilename("Italiano-Inglese.txt");
//	}
	
	public void daFileAVariabile(
			ArrayList<String> parole,
			ArrayList<String> traduzione
			) throws IOException {
		
		FileReader fileReader = new FileReader(filename);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		try {
			while (true) {
				int i = 0;
				String[] tmp;
				tmp = bufferedReader.readLine().split(":");

				parole.add(tmp[i]);
				traduzione.add(tmp[i + 1]);
//				fraseDiEsempio.add(tmp[i + 2]);
			}
		} catch (NullPointerException e) {
			bufferedReader.close();
			fileReader.close();
		}
	}
	
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename){
		this.filename = filename;
//		return filename;
	}
	
}