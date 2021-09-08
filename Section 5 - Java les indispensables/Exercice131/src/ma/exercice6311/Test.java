package ma.exercice6311;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Stagiaire> stagiaires = new ArrayList<Stagiaire>();
		stagiaires.add(new Stagiaire("Louis-philippe", "Botman"));
		stagiaires.add(new Stagiaire("Wertz" , "Pierre"));
		stagiaires.add(new Stagiaire("Yves", "Amine"));
		stagiaires.add(new Stagiaire("Jean-jack", "Hofman"));
		stagiaires.add(new Stagiaire("Cheick", "Mohamed"));
		stagiaires.add(new Stagiaire("Messen", "Patrick"));
 
		System.out.println("Avant le tri : ");
		for (Stagiaire s : stagiaires)
			System.out.println("\t" + s);
 
		Collections.sort(stagiaires);
 
		System.out.println("Après le tri : ");
		for (Stagiaire s : stagiaires)
			System.out.println("\t" + s);


	}

}
