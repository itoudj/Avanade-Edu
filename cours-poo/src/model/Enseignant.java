package model;

public class Enseignant extends Personne {
	private int salaire;

	public Enseignant(int num, String nom, String prenom, Adresse[] adresses, int salaire) {
		super(num, nom, prenom, adresses);
		this.salaire = salaire;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Enseignant [salaire=" + salaire + "," + super.toString() + "]";
	}

	@Override
	public void afficherDetails() {
		System.out.println(this.getNom() + this.getPrenom() + this.getSalaire());
	}	
}
