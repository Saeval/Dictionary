package dizionario;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import dizionario.ui.BottoneDiVerifica;

public class Director {
	
	private Director(){};
	
	private static Director mediator = new Director();
	
	public static Director getUnicoDirector(){
		return mediator;
	}
	
	private JTextField textField = new JTextField("Inserisci la parola da cercare");
	private BottoneDiVerifica button = new BottoneDiVerifica("Traduci");
	private JTextArea textArea = new JTextArea("Output");
	private Dizionario dizionario = new Dizionario();
	
	public JTextField getTextField() {
		return textField;
	}
	public BottoneDiVerifica getButton() {
		return button;
	}
	public JTextArea getTextArea() {
		return textArea;
	}
	public Dizionario getDizionario() {
		return dizionario;
	}
	

}
