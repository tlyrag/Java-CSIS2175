import java.util.Scanner;


public class Investor {
	static Scanner input = new Scanner(System.in);
	
	private String name;
	private  double funds;
	private  int drillCost;
	private  int[] drillPosition;
	private  int drillDepths;
	private int totalSpent;
	
	Investor(String name,double funds, int drillCost) {
		this.name = name;
		this.funds = funds;
		this.drillCost = drillCost;
	
		
	}
	
	public int[] GetDrillInfo() {
		int xd,yd,depths;
		System.out.println("Please enter the X coordinate");
		 xd =input.nextInt();
		

		
		System.out.println("Please enter the y coordinate");
		 yd =input.nextInt();
		
	
		
		System.out.println("Please enter the depths to drill " +this.funds+" left. ");
		 depths =input.nextInt();
		
		if(this.funds<depths*this.drillCost ||  xd>3 || xd<0 || yd>3 || yd<0) {
			System.out.println("Please be aware that X and Y msut be between 0 and 3 and You should have enough funds to drill");
			input.nextLine();
			System.out.println("You only have " + this.funds+ "left");
			GetDrillInfo();
			return this.drillPosition;
		}
		this.drillDepths = depths;
		
		
		int[] drillPosition = {xd,yd};
		this.drillPosition= drillPosition;
		return this.drillPosition;
	}
	public int[] getCurrentDrillPosition() {
		return this.drillPosition;
	}
	
	public int getDrillDepth() {
		return this.drillDepths;
	}
	
	public double getFunds() {
		return this.funds;
	}
	public void setFunds() {
		this.funds = this.funds - this.drillCost *this .drillDepths; 
		this.totalSpent += this.drillCost *this.drillDepths;
	}
	public int getTotalSpent() {
		return this.totalSpent;
	}
	@Override
	public String toString() {
		StringBuilder investor = new StringBuilder();
		
		investor.append("Investor Name: " + this.name + "\n");
		investor.append("Investor Funds: " + this.funds + "\n");
		investor.append("Investor drillCost: " + this.drillCost + "\n");
		investor.append("Investor drillDepths: " + this.drillDepths + "\n");
		investor.append("Investor X Coordinate: " + this.drillPosition[0] + "\n");
		investor.append("Investor Y Coordinate: " + this.drillPosition[1] + "\n");
		
		
		return investor.toString();
		
	}
}
