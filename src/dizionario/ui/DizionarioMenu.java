package dizionario.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import dizionario.io.LettoreFile;

public class DizionarioMenu extends JMenuBar {
	private static final long serialVersionUID = 1;
	
	private final static String DIZIONARIO_ITALIANO_FRANCESE = "Italiano-Francese.txt";
	private final static String DIZIONARIO_ITALIANO_INGLESE = "Italiano-Inglese.txt";

	private LettoreFile lettoreFile = LettoreFile.getUnicoLettore();

	JMenu menu = new JMenu("Lingue");
	JMenuItem ita_eng = new JMenuItem("Italiano-Inglese");
	JMenuItem ita_fr = new JMenuItem("Italiano-Francese");

	public DizionarioMenu() {
		super();
		add(menu);
		menu.add(ita_eng);
		menu.add(ita_fr);

		setActionListeners();
	}

	private void setActionListeners() {
		ita_eng.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lettoreFile.setFilename(DIZIONARIO_ITALIANO_INGLESE);;
			}
		});

		ita_fr.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lettoreFile.setFilename(DIZIONARIO_ITALIANO_FRANCESE);
			}
		});
	}

}
