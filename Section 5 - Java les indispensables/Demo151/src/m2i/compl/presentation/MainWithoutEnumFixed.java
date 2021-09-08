package m2i.compl.presentation;

import m2i.impl.bal.ECafe;
import m2i.impl.bal.WithoutEnumeration;

public class MainWithoutEnumFixed {

	public static void servir(ECafe type) {
		if (type == ECafe.COURT)
			System.out.println("Service un café COURT");
		if (type == ECafe.LONG)
			System.out.println("Servir un café LONG");
	}
	
	public static void main(String[] args) {
		
		servir(ECafe.COURT);
		servir(ECafe.LONG);
		servir(4);
	}

}
