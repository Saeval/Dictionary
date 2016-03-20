package dizionario.test;

import java.io.IOException;

import javax.swing.JFrame;

import dizionario.ui.DizionarioMenu;
import dizionario.ui.SuperPanel;

public class MainTest {
		
	public static void main(String[] args) throws IOException {
		JFrame frame = new JFrame("Dizionario");
		SuperPanel superPanel = new SuperPanel();
		DizionarioMenu dizionarioMenu = new DizionarioMenu();
		
		frame.setJMenuBar(dizionarioMenu);
		
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(superPanel);
		
		frame.setVisible(true);
	}

}
