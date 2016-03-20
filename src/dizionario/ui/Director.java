package dizionario.ui;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import dizionario.Dizionario;

public class Director {
	
	private Director(){};
	
	private static Director unicoDirector = new Director();
	
	public static Director getUnicoDirector(){
		return unicoDirector;
	}
	
	private JTextField textField = new JTextField("Inserisci la parola da cercare");
	private BottoneDiVerifica bottoneDiVerifica = new BottoneDiVerifica("Verifica");
	private JTextArea textArea = new JTextArea("Output");
	private Dizionario dizionario = new Dizionario();
	
	public Dizionario getDizionario() {
		return dizionario;
	}
	
	public String getDizionarioValue(String key){
		if (dizionario.getDizionario().containsKey(key))
			return dizionario.getDizionario().get(key);
		else return
				"Chiave non presente nel dizionario!";
	}
	
	public boolean isValore(String key){
		if (dizionario.getDizionario().containsKey(key))
			return true;
		else
			return false;
	}
	
	public JTextField getTextField() {
		return textField;
	}
	
	public JTextArea getTextArea() {
		return textArea;
	}
	
	public BottoneDiVerifica getBottoneDiVerifica() {
		return bottoneDiVerifica;
	}

}
