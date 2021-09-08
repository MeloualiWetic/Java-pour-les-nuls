package m2i.tp21.gui;

import java.util.Random;

public class Main {

	public static void main(final String[] args) {
		System.out.println("isVide");
		System.out.println("null : "  + ChaineUtil.isVide(null));
		System.out.println("\"\" : " + ChaineUtil.isVide(""));
		System.out.println("sdfsdf : "+ChaineUtil.isVide("sdfsdf"));
				
		System.out.println("\nisPalindrome");
		System.out.println("null : " + ChaineUtil.isPalindrome(null));
		System.out.println("\"\" : " + ChaineUtil.isPalindrome(""));
		System.out.println("laval : " + ChaineUtil.isPalindrome("laval"));
		System.out.println("ananas : " + ChaineUtil.isPalindrome("ananas"));
		
		System.out.println("\nNombre de voyelles");
		System.out.println("null : " + ChaineUtil.nbreVoyelle(null));
		System.out.println("\"\" : " + ChaineUtil.nbreVoyelle(""));
		System.out.println("aeiouy : " + ChaineUtil.nbreVoyelle("aeiouy"));
		System.out.println("schtroumphs : " + ChaineUtil.nbreVoyelle("schtroumphs"));
		
	}
}
