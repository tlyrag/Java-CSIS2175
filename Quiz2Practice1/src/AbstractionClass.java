
public abstract class AbstractionClass {
	
	private String privateName;
	public String publicName;
	public static String staticName;
	protected String protectedName;
	
	public void publicSayName() {
		  System.out.println(this.protectedName);
		  System.out.println(this.publicName);
		  System.out.println(this.staticName);
		  System.out.println(this.privateName);
	}

	private void privateSayName() {
		  System.out.println(this.protectedName);
		  System.out.println(this.publicName);
		  System.out.println(this.staticName);
		  System.out.println(this.privateName);
	}
	
	public static void staticSayName() {
	
		  System.out.println(staticName);

	}
	public abstract void abstractSayName();
	
}
