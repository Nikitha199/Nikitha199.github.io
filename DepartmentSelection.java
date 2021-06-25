package oopsproj;

public class DepartmentSelection {

	public static void main(String[] args) {
		Department dep=Intellect.getDepartMent();
		if(dep instanceof HR) { 
			System.out.println("dep is pointing at HR");
		}
		else if(dep instanceof Management) { 
			System.out.println("dep is pointing at Management");
		}
		else if (dep instanceof Infrastructure) {
			System.out.println("dep is pointing at Infrastructure");
		}
		
	}
	}


