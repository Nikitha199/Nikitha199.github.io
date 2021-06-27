package com.exceptions.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {
	public static void main(String[] args) {
			
			try
			{
				File f=new File("tex.txt");
				FileWriter fwriter=new FileWriter(f);
				fwriter.write("This is my first smaple program with file writer in java");
				fwriter.close();
				FileReader fr = new FileReader(f);
				System.out.println("Started reading file");
				int i;
				while((i=fr.read())!=-1) {
				System.out.print((char)i);
				}
				fr.close();
				System.out.println();
				System.out.println("File is closed....");
			}
			catch(FileNotFoundException e) {
				System.out.println("File problem : "+e);
				
			} catch (IOException e) {
				System.out.println("I/O problem : "+e);
			}
			
		}
	}

