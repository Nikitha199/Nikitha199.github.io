package com.exceptions.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args)  {
		//start of FileNotFound exception logic
			try {
				
			FileInputStream fileStream=new FileInputStream("C:/Users/Nikitha/eclipse-workspace/ExceptionProject/src/com/exceptions/demo/test.txt");			
			//fileStream.close();
		fileStream.read();
			fileStream.close();
			 
			Class temp = Class.forName(
		                "C:/Users/Nikitha/eclipse-workspace/ExceptionProject/src/com/exceptions/demo/Test.java"); 
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File does not exist\t"+e.getMessage());
		}
			catch(IOException ie)
			{
				System.out.println("IO Exception occured while reading from file/t"+ie.getMessage());
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println("Test.java class does not exist/t"+ce.getMessage());
			}
		finally
		{
			System.out.println("Closing the file input stream");
			
		}
	}	
		

	}


