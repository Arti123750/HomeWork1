package com.abc.quetion;

class Equals {
	int id;
	String name;

	Equals(int id, String name) {
		this.id = id;
		this.name = name;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		Equals e1 = (Equals) obj;
		if (id == e1.id && name == e1.name)
			return true;
		else
			return false;

	}
}

public class EqualsMethodLogic {

	public static void main(String[] args) {

		Equals equals1 = new Equals(10, "ABC");
		Equals equals2 = new Equals(10, "ABC");
		System.out.println(equals1 == equals2);
		System.out.println(equals1.equals(equals2));

		/*
		 * System.out.println(equals1); System.out.println(equals2);
		 */

	}

}
