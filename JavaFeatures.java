package oopsproj;

import java.util.ArrayList;
import java.util.List;

public class JavaFeatures {
	 public void feature(int version,String feat) {
		 System.out.println("Java Version"+version);
		 System.out.println("Java"+version+"\tfeature\t"+feat);
	 }
	 public void feature(int version,String feat1, String feat2) {
		 System.out.println("Java Version"+version);
		 System.out.println("Java"+version+"\tfeature1\t"+feat1);
		 System.out.println("Java"+version+"\tfeature2\t"+feat2);
	 }
	 public void feature(int version,String feat1, String feat2,String feat3) {
		 System.out.println("Java Version"+version);
		 System.out.println("Java"+version+"\tfeature1\t"+feat1);
		 System.out.println("Java"+version+"\tfeature2\t"+feat2);
		 System.out.println("Java"+version+"\tfeature3\t"+feat3);
	 }
	 public void feature(int version,String feat1, String feat2,String feat3,String feat4) {
		 System.out.println("Java Version"+version);
		 System.out.println("Java"+version+"\tfeature1\t"+feat1);
		 System.out.println("Java"+version+"\tfeature2\t"+feat2);
		 System.out.println("Java"+version+"\tfeature3\t"+feat3);
		 System.out.println("Java"+version+"\tfeature4\t"+feat4);
	 }
	 public void feature(int version,String feat1, String feat2,String feat3,String feat4,String feat5) {
		 System.out.println("Java Version"+version);
		 System.out.println("Java"+version+"\tfeature1\t"+feat1);
		 System.out.println("Java"+version+"\tfeature2\t"+feat2);
		 System.out.println("Java"+version+"\tfeature3\t"+feat3);
		 System.out.println("Java"+version+"\tfeature4\t"+feat4);
		 System.out.println("Java"+version+"\tfeature5\t"+feat5);
	 }
	 public void feature(int version,String feat1, String feat2,String feat3,String feat4,String feat5,String feat6) {
		 System.out.println("Java Version"+version);
		 System.out.println("Java"+version+"\tfeature1\t"+feat1);
		 System.out.println("Java"+version+"\tfeature2\t"+feat2);
		 System.out.println("Java"+version+"\tfeature3\t"+feat3);
		 System.out.println("Java"+version+"\tfeature4\t"+feat4);
		 System.out.println("Java"+version+"\tfeature5\t"+feat5);
		 System.out.println("Java"+version+"\tfeature6\t"+feat6);
	 }
	 public void feature(int version,String feat1, String feat2,String feat3,String feat4,String feat5,String feat6,String feat7) {
		 System.out.println("Java Version"+version);
		 System.out.println("Java"+version+"\tfeature1\t"+feat1);
		 System.out.println("Java"+version+"\tfeature2\t"+feat2);
		 System.out.println("Java"+version+"\tfeature3\t"+feat3);
		 System.out.println("Java"+version+"\tfeature4\t"+feat4);
		 System.out.println("Java"+version+"\tfeature5\t"+feat5);
		 System.out.println("Java"+version+"\tfeature6\t"+feat6);
		 System.out.println("Java"+version+"\tfeature7\t"+feat7);
	 }
	 public void feature(int version, List<String> featList)  {
		 System.out.println("Java Version"+version);
		 System.out.println("Java"+version+"\tfeatures\t");
		 for(String feat:featList) {
			 System.out.println(feat);
		 }
	 }
	public static void main(String[] args) {

		 List<String> featList=new ArrayList<String>();
		 JavaFeatures java=new JavaFeatures();
		 java.feature(1, "JDBC");
		 java.feature(2, "Collection","JIT");
		 java.feature(3, "Java Sound","Jar Indexing","List of Enhancements");
		 java.feature(4, "XML Processing","Logging API","JDBC3.o","Assertions");
		 java.feature(5, "Generics","Static Import","Varargs","Metadata","Instrumentation");
		 java.feature(6, "JDBC4.o","Java Compiler API","Scripting Language","pluggable Annotations","Java GSS","LDAP");
		 java.feature(7, "null handling","Binary Literals","nio","EXP Handling","Try with Resources","Diamond Syntax","_ in literals");
		 
		 featList.add("Lambda Expression");
		 featList.add("for each method");
		 featList.add("Streams");
		 featList.add("for each method");
		 featList.add("deafault methods");
		 featList.add("Date and Time API");
		 featList.add("Parallel operations");
		 featList.add("Type Annotations");
		 
		 java.feature(8, featList);
		 

	}

}
