package ma.projet.ecole;

public class Specialite {
	private int id;
	private String code;
	private String libelle;
	private static int count;

	public Specialite(String code, String libelle) {
		this.id = ++count;

		this.code = code;
		this.libelle = libelle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Specialite.count = count;
	}

	public String toString() {
		return this.libelle;
	}

}
