package com.abc.quetion;



final class Immuatable {
	private int id;
	private String name;

	public Immuatable(int id,String name) {

		this.id =id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
public class ImmutableClassDemo {

	public static void main(String[] args) {

		Immuatable immuatable=new Immuatable(10, "ABC");
		Immuatable immuatable2=new Immuatable(20, "PQR");
		System.out.println(immuatable.getName());
		System.out.println(immuatable2.getId());
		System.out.println(immuatable2.getName());



	}

}
