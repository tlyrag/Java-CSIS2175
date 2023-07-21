
public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animalRef = new Animal[10];
		
		
		for(int i=0;i<animalRef.length;i++)
		{
			if(i%3==0)
			{
				animalRef[i] = new WorkingDog();
				animalRef[i].speak();
			}
			else if(i%3==1)
			{
				animalRef[i] = new Cow();
				animalRef[i].speak();
			}
			else
			{
				animalRef[i] = new Snake();
				animalRef[i].speak();
			}	
		}
		boolean isDogAnAnimal = (animalRef[1] instanceof Animal);
		System.out.println(isDogAnAnimal);

		
			

	}

}
