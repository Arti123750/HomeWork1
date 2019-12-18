package com.abc.quetion;

class CustomException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String str;
	public CustomException(String str) {

		this.str=str;
	}

	public String toString()
	{
		return("message = "+str);
	}
}

public class CustomExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			throw new CustomException("Our Exception");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
