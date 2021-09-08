package ma.projet.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Etudiant {

	private int id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private Filiere filiere;

	private static int count;

	public Etudiant(String nom, String prenom, Date dateNaissance,
	Filiere filiere) {
		this.id = ++count;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.filiere = filiere;
	}

	
	public Filiere getFiliere() {
		return filiere;
	}


	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		return "Je suis l'filiere " + this.nom + " " + this.prenom
				+ " ma date de naissance est : " + sdf.format(this.dateNaissance);
	}

}
