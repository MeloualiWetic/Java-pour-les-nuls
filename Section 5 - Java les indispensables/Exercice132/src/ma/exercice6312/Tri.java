package ma.exercice6312;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list = new ArrayList<String>();
	        list.add("Mai");
	        list.add("Mikasa");
	        list.add("Eren");
	        list.add("Zack");
	        list.add("Rachel");
	        System.out.println("Avant le tri :");
	        for (String s : list) {
	            System.out.println("\t"+s);
	        }
	        Collections.sort(list);
	        System.out.println("Après le tri :");
	        for (String s : list) {
	            System.out.println("\t"+s);
	        }


	}

}
