package com.dominos.main;

public enum BaseType {

	THINCRUST("THINCRUST", 20), THICKCRUST("THICKCRUST", 25), CHEESEBURST(
			"CHEESEBURST", 30), HANDTOSSED("HANDTOSSED", 35), PANPIZZA(
			"PANPIZZA", 15);

	public String base;
	public int baseVal;

	private BaseType(String base, int baseVal) {
		this.base = base;
		this.baseVal = baseVal;
	}

}
