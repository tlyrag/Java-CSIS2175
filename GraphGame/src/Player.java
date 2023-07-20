
public abstract class Player {
	private int id;
	private int health = 100;
	private int strength;
	private int initiative;
	
	Player(int id,int strength, int initiative) {
		this.id=id;
		this.strength=strength;
		this.initiative=initiative;
	}
	
	public int getId() {
		return this.id;
	}
	public int getHealth() {
		return this.health;
	}
	public int getStrength() {
		return this.strength;
	}
	public abstract void attack(Player player);
	
}
