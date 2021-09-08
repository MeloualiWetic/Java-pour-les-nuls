package m2i.compl.presentation;

import m2i.impl.bal.WithoutEnumeration;

public class MainWithoutEnum {

	public static void main(String[] args) {
		
		WithoutEnumeration ae = new WithoutEnumeration();
		ae.servir(WithoutEnumeration.COURT);
		ae.servir(WithoutEnumeration.LONG);
		ae.servir(4);
	}

}
