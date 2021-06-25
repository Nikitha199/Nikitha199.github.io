package com.exceptions.demo;

public class UncheckedExceptionTest {

	public static void main(String[] args) {

try
{
	int i=10/0;
	System.out.println("i value is"+i);
	String s=null;
	//String s="exception";
	if(s.equals("exception"))
	{
	System.out.println("t value is"+s);
	}
	int a[]=new int[10];
	int j=a[11];
	System.out.println("j value is"+j);
}
catch(ArithmeticException ae)
{
	System.out.println("Arithmetic excpetion happend\t"+ae.getMessage());
}
catch(NullPointerException e)
{
	System.out.println("Null pointer excpetion happend\t"+e.getMessage());
}
catch(ArrayIndexOutOfBoundsException ex)
{
	System.out.println("Array index out of bounds Excpetion happned\t"+ex.getMessage());
}
finally
{
	System.out.println("FInally block");
}
	}

}
