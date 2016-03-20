package dizionario.ui;

import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JPanel;

public class SuperPanel extends JPanel{
	private static final long serialVersionUID = 0;
	
	private Director mediator = Director.getUnicoDirector();

//	private ArrayList<String> fraseDiEsempio = new ArrayList<String>();
	
	public SuperPanel() throws IOException {
		super();
		setLayout(new GridLayout(3, 1));
		add(mediator.getTextField());
		add(mediator.getButton());
		add(mediator.getTextArea());
		
		mediator.getTextArea().setEditable(false);
		
	}
	
}
