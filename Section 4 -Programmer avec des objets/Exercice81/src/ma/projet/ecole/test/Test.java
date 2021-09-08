package ma.projet.ecole.test;

import ma.projet.ecole.Professeur;
import ma.projet.ecole.Specialite;

public class Test {
	public static void main(String[] args) {
		Specialite[] specialites = new Specialite[5];
		// Creation des specialites
		specialites[0] = new Specialite("S1", "JAVA/JEE");
		specialites[1] = new Specialite("S2", ".net");
		specialites[2] = new Specialite("S3", "Gestion de projet");
		specialites[3] = new Specialite("S4", "CISCO");
		specialites[4] = new Specialite("S5", "PHP");

		// Creation des professeurs
		Professeur professeurs[] = new Professeur[4];
		professeurs[0] = new Professeur("Safi", "salim", "0656787567",
				"safi@gmail.com", specialites[0]);
		professeurs[1] = new Professeur("Rami", "amal", "0654487567",
				"rami@gmail.com", specialites[3]);
		professeurs[2] = new Professeur("Rashidi", "Mohamed", "0656777567",
				"rashidi@gmail.com", specialites[0]);
		professeurs[3] = new Professeur("Simon", "thomas", "0654445567",
				"simon@gmail.com", specialites[3]);

		// Professeur par specialite
		System.out.println("Professeur par specialite : ");
		for (Specialite s : specialites) {
			System.out.println("\t" + s);
			int etat = 0;
			for (Professeur p : professeurs) {
				if (p.getSpecialite().getId() == s.getId()) {
					System.out.println("\t\t" + p);
					etat = 1;
				}
			}
			if (etat == 0) {
				System.out.println("\t\tAucun professeur dans cette specialite");
			}
		}

	}

}
