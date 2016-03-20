package dizionario.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import dizionario.Director;
import dizionario.io.LettoreFile;

public class BottoneDiVerifica extends JButton{
	private static final long serialVersionUID = 2;
	
	private Director mediator = Director.getUnicoDirector();
	private LettoreFile lettoreFile = LettoreFile.getUnicoLettore();
	private String input;

	public BottoneDiVerifica(String text) {
		super(text);
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					mediator.getDizionario().inizializzaDizionario(lettoreFile);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.toString(), "Errore!", JOptionPane.ERROR_MESSAGE);
				}
				
				input = mediator.getTextField().getText();
				if(mediator.getDizionario().getDizionario().containsKey(input))
					mediator.getTextArea().setText(mediator.getDizionario().getDizionario().get(input));
				else{
					mediator.getTextArea().setText("Input / Key:\n" + input + "\nTraduzione: " + mediator.getDizionario().getDizionario().get(input));
					mediator.getTextArea().append("\n"+mediator.getDizionario().getDizionario().entrySet().toString());
				}
			}
		});
	}

}
