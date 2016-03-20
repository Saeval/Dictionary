package dizionario.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BottoneDiVerifica extends JButton{
	private static final long serialVersionUID = 3;
	
	private String input;
	private Director mediator = Director.getUnicoDirector();
//	private LettoreFile lettoreFile = LettoreFile.getUnicoLettore();
	
	public BottoneDiVerifica(String text) {
		super(text);
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					input = mediator.getTextField().getText();
				} catch (NullPointerException e) {
					mediator.getTextField().setText("Ciao");
				}
				if(mediator.isValore(input))
					mediator.getTextArea().setText(mediator.getDizionarioValue(input));
				else{
//					mediator.getTextArea().setText("Input / Key:\n" + input + "\nTraduzione: " + mediator.getDizionario().getDizionario().get(input));
//					mediator.getTextArea().append("\n"+mediator.getDizionario().getDizionario().entrySet().toString());
					System.out.print("Errore! Parola non presente nel dizionario");
				}
			}
		});
	}

}
