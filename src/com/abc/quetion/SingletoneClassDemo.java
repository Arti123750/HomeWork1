package com.abc.quetion;

class Singletone {
	private static Singletone singletone;
	public String s;

	private Singletone() {
		s = "Singletone Example";
	}

	public static Singletone getInstance() {
		if (singletone == null)
			singletone = new Singletone();
		return singletone;

	}
}

public class SingletoneClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singletone s1 = Singletone.getInstance();
		Singletone s2 = Singletone.getInstance();

		System.out.println(s1.s);
		System.out.println(s2.s);

	}

}
