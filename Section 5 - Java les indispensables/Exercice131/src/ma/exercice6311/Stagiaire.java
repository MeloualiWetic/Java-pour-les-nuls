package ma.exercice6311;

public class Stagiaire implements Comparable<Stagiaire>{
	private String nom;
	private String prenom;
 
	public Stagiaire(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
 
	public String toString() {
		return this.nom + " " + this.prenom;
	}
	@Override
	public int compareTo(Stagiaire s) {
		if (!this.nom.equals(s.nom))
			return this.nom.compareTo(s.nom);
		else
			return this.prenom.compareTo(s.prenom);
	}

}
