package m2i.impl.bal;

public enum ECafeDemo3 {
	COURT("Le cafe Court"), LONG("Le cafe Long"), CAPPUCINO("Le cafe Cappucino");

	private String type = "";

	ECafeDemo3(String pType) {
		this.type = pType;

	}

	public String toString() {
		return this.type;
	}
}
