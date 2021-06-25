package oopsproj;

public abstract class Bird {
	void eat() {
		System.out.println("All Birds eat");
	}

	abstract void sleep() ;
	
			
}

	 class Pigeon extends Bird implements BirdWorld {
		
		 public void fly() {
			System.out.println("Pigeon flys!!");
		}

				void sleep() {
			System.out.println("Pigeon sleeps at night time");
			
		}
	}

	 class Owl extends Bird implements BirdWorld{
		public void fly() {
			System.out.println("Owl Cannot fly");
		}

		
		void sleep() {
			System.out.println("Owl sleeps at day time");
			
		}
	}

	 class Toucans extends Bird implements BirdWorld{
		public void fly() {
			System.out.println("Toucans has long nose and cannot fly");
		}

		
		void sleep() {
			System.out.println("Toucans sleeps at night time");
			
		}

	}

	

