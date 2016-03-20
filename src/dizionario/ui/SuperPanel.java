package dizionario.ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import dizionario.Dizionario;
import dizionario.io.LettoreFile;

public class SuperPanel extends JPanel{
	private static final long serialVersionUID = 0;
	
	private Dizionario dizionario = new Dizionario();
	private LettoreFile lettoreFile = LettoreFile.getUnicoLettore();

//	private ArrayList<String> fraseDiEsempio = new ArrayList<String>();

	private String input;
	
	private JTextField textField = new JTextField("Inserisci la parola da cercare");
	private JButton button = new JButton("Ricerca");
	private JTextArea textArea = new JTextArea("Output");
	
	public SuperPanel() throws IOException {
		super();
		setLayout(new GridLayout(3, 1));
		add(textField);
		add(button);
		add(textArea);
		
		textArea.setEditable(false);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					dizionario.inizializzaDizionario(lettoreFile);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.toString(), "Errore!", JOptionPane.ERROR_MESSAGE);
				}
				
				input = textField.getText();
				if(dizionario.getDizionario().containsKey(input))
					textArea.setText(dizionario.getDizionario().get(input));
				else{
					textArea.setText("Input / Key:\n" + input + "\nTraduzione: " + dizionario.getDizionario().get(input));
					textArea.append("\n"+dizionario.getDizionario().entrySet().toString());
				}
			}
		});
	}
	
	

}
