package ma.exercice6313;
import java.util.ArrayList;
import java.util.Iterator;
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
        
        System.out.println("Méthode 1 :");
        for (int i = 0; i < list.size(); i++ ) {
            System.out.println("\t" + list.get(i));
        }
                
        System.out.println("Méthode 2 :");
        for (String s : list) {
            System.out.println("\t" + s);
        }
 
        System.out.println("Méthode 3 :");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("\t" + it.next());
        }


	}

}
