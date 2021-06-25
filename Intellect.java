package oopsproj;

import java.util.Scanner;

public class Intellect {
				
	static Department getDepartMent() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Select Choice of Department");
		System.out.println("1. HR | Human Resource");
		System.out.println("2. Managemnet | Leading");
		System.out.println("3. Infrastructure | Maintaince");
		int choice = scan.nextInt();
		Department dep = null;
		switch(choice) {
			case 1: dep = new HR(); break;  
			case 2: dep = new Management(); break;
			case 3: dep = new Infrastructure(); break;
		}
		return dep;
	}

		}
		