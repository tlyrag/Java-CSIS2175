
public class AnimalDemo {
	public static void main(String[] arg) {
		
		Animal anAnimal;
		Dog myDog = new Dog("bruce",4);
		Cow myCow = new Cow("lotus",4);
		Snake aSnake = new Snake("python",4);
		WorkingDog myWorkingDog = new WorkingDog("stone",4);
		
		myDog.speak();
		myCow.speak();
		aSnake.speak();
		System.out.println("My Legs" + myDog);
		myDog.setLegs(4);
		anAnimal = new Dog("Jasper",4);
		anAnimal.speak();
	
		myWorkingDog.speak();
		myWorkingDog.working();
		
		
		myDog = myWorkingDog;
		((WorkingDog)myDog).working();
		
		String a = "a";
		//int b = (int)a/2; 
	}
}
