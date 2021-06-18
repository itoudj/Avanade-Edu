package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dao.PersonneDao;
import model.Personne;

public class Fenetre extends JFrame implements ActionListener {
	
	JLabel nomLabel = new JLabel("Nom");
	JTextField nomText = new JTextField();
	JLabel prenomLabel = new JLabel("Préom");
	JTextField prenomText = new JTextField();
	JButton bouton = new JButton("Afficher");

	public Fenetre() {
		setSize(500, 500);
		setVisible(true);
		setTitle("First frame");
		nomLabel.setBounds(20, 20, 100, 20);
		nomText.setBounds(150, 20, 100, 20);
		prenomLabel.setBounds(20, 50, 100, 20);
		prenomText.setBounds(150, 50, 100, 20);
		bouton.setBounds(150,  400,  100, 20);
		add(nomLabel);
		add(nomText);
		add(prenomLabel);
		add(prenomText);
		add(bouton);
		setLayout(null);
		bouton.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nom = nomText.getText();
		String prenom = prenomText.getText();
		Personne personne = new Personne(nom, prenom);
		PersonneDao dao = new PersonneDao();
		dao.save(personne);
		JOptionPane.showMessageDialog(null, "Personne ajoutée avec succés");
		
		
	}
}
