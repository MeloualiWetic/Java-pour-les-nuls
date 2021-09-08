package ma.projet.ecole;

public class Professeur {
	private int id;
	private String nom;
	private String prenom;
	private String telephone;
	private String email;
	private Specialite specialite;
	private static int count;

	public Professeur(String nom, String prenom, String telephone,
			String email, Specialite specialite) {
		this.id = ++count;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.specialite = specialite;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = ++count;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Specialite getSpecialite() {
		return specialite;
	}

	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
	}

	public String toString() {
		return "-" + this.nom.toUpperCase() + " "
				+ this.prenom.substring(0, 1).toUpperCase() + ""
				+ this.prenom.substring(1).toLowerCase() + " " + this.email;
	}

}
