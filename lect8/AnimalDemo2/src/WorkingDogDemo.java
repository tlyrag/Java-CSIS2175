
public class WorkingDogDemo {
	public static void main(String[] args)
	{
		WorkingDog aSheepherder = new WorkingDog();
		
		aSheepherder.name = "Simon";
		aSheepherder.hrs = 200;
		aSheepherder.speak();
		
		System.out.println("Let's see how the working dog works");
		aSheepherder.work();
	}
}
