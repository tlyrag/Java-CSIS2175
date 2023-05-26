
public class Mortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//M = P*R*(1+r)^n / (1+r)^n-1
		
		
		
		final int MON_PER_YEAR =12;
		double P = 100_000_000;
		double anualRate =0.06;//6%
		int year= 25;
		int num= 25 * MON_PER_YEAR;
		double r = anualRate/MON_PER_YEAR;
		
		double M;
		
		M = P*r* Math.pow((1+r),num) / (Math.pow((1+r), num)-1);
		
		
		System.out.printf("Monthly Payment is: $%.2f \n", M);
		PrintHeader();
		
		PrintPlan(1,2,3,4);
		
	}
	
	static void PrintHeader() {
		System.out.printf("%-12s","Payment");
		System.out.printf("%-15s","Principal");
		System.out.printf("%-15s","Interest");
		System.out.printf("%-15s","Balance");
		System.out.printf("\n");
	}
	static void PrintPlan(int index, double principal, double interest, double balance) {
		System.out.printf("%-12s",index);
		System.out.printf("%-15s",principal);
		System.out.printf("%-15s",interest);
		System.out.printf("%-15s",balance);
		System.out.printf("\n");
	}

}
