package m2i.tp21.gui;

import java.util.Random;

public class Manip3 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int nombre = rnd.nextInt(99);
		
		System.out.println("Le nombre est: " + nombre);
		
		if (0  < nombre && nombre < 9) {
			System.out.println("0 dizaine");
		}else if (nombre <= 19) {
			System.out.println("1 dizaine");
		}else if (nombre <= 29) {
			System.out.println("2 dizaine");
		}else if (nombre <= 39) {
			System.out.println("3 dizaine");
		}else if (nombre <= 49) {
			System.out.println("4 dizaine");
		}else if (nombre <= 59) {
			System.out.println("5 dizaine");
		}else if (nombre <= 69) {
			System.out.println("6 dizaine");
		}else if (nombre <= 79) {
			System.out.println("7 dizaine");
		}else if (nombre <= 89) {
			System.out.println("8 dizaine");
		}else if (nombre <= 99) {
			System.out.println("9 dizaine");
		}
	}
}
