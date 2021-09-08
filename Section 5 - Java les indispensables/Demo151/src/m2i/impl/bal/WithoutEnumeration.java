package m2i.impl.bal;

public class WithoutEnumeration {
	
	public static final int COURT = 1;
	public static final int LONG = 2;

	public void servir(int param) {
		if (param == COURT)
			System.out.println("Service un café COURT");
		if (param == LONG)
			System.out.println("Servir un café LONG");
	}
}
