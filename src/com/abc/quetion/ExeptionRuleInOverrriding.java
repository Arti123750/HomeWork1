package com.abc.quetion;

import java.io.EOFException;
import java.io.FileNotFoundException;

class Exception1 {
	public void m1() throws EOFException, FileNotFoundException {
		System.out.println("Parent class ");

	}

}

class Exception2 extends Exception1 {

	public void m1() throws FileNotFoundException// not allowed
	{
		System.out.println("Child class");

	}
}

public class ExeptionRuleInOverrriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
