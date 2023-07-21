
public class TestDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog("Hunting Dog");
		Animal aDog = new Animal("Murphy");
		Animal Doge = (Animal)myDog;
		//aDog = (Dog) aDog;
		aDog.Move();
		//Doge.Move();
		//myDog.name = "Mountain";
		
//		System.out.println(myDog.name + " is a " + myDog.breed);
//		
//		myDog.Move();
//		myDog.Eat();
		
	}

}
