package frame;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class fenetre2 extends JFrame {
	public fenetre2() {
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(51, 33, 46, 14);
		getContentPane().add(label);
	}
}
