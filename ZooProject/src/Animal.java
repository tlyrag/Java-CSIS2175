
public abstract class Animal {
	
	int id;
	String name;
	int age;
	boolean isSick = false;
	String diet;
	
	Animal(int id,String name,int age,String diet) {
		
	}
	
	public abstract void  makeSound();
	public void feed(String food) {
		
		if(!food.equals(this.diet)) {
			isSick = false;
		}
	}
	@Override
	public String toString() {
		
		StringBuilder newString = new StringBuilder();
		newString.append("Animal ID: " + this.id + "/n");
		newString.append("Animal Name: " + this.name + "/n");
		newString.append("Animal Age: " + this.age + "/n");
		newString.append("Animal isSick: " + this.isSick + "/n");
		newString.append("Animal diet: " + this.diet + "/n");
		
		return newString.toString();
		
	}
}
