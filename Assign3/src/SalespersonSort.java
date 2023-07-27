import java.util.Scanner;
public class SalespersonSort {
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Salesperson[] salesArray = createSalesArray();
		int userOption =getUserOption();
		salesArray= orderByType(userOption, salesArray);
		displaySalesArray(salesArray);
		
		
		
	}
	
	public static Salesperson[] createSalesArray() {
		Salesperson[] salesArray = new Salesperson[3];
		for(int i =0;i<salesArray.length;i++) {
			Salesperson sales = new Salesperson(getSalesID(),getSalesAmount());
			salesArray[i] = sales;
		}
		return salesArray;
	}
	
	public static int getSalesID() {
		try {
			int id;
			System.out.println("Please enter Sales ID");
			id = input.nextInt(); 
			return id;
		} catch(Exception err) {
			input.next();
			return getSalesID();
		}		
	}
	public static double getSalesAmount() {
		try {
			double salesAmount;
			System.out.println("Please enter Sales Amount");
			salesAmount = input.nextDouble(); 
			return salesAmount;
		} catch(Exception err) {
			input.next();
			return getSalesAmount();
		}		
	}
	public static int getUserOption() {
		try {
			int id;
			System.out.println("Please select 1 To display Sales Ordered by ID or 2 to order by Sales Amount");
			id = input.nextInt(); 
			if(id!=1 && id!=2) {
				System.out.println("Caiu aqui");
				throw new Exception();
			}
			return id;
		} catch(Exception err) {
			input.next();
			System.out.println("Please enter 1 or 2");
			return getUserOption();
		}	
	}
	public static void displaySalesArray(Salesperson[] salesArr) {
		for(int i =0;i<salesArr.length;i++) {
			System.out.print(salesArr[i]);
		}
	}
	public static Salesperson[] orderByType(int num,Salesperson[] salesArr) {
		
		int[] nums = new int[3];
		switch(num) {
			case 1:
				return idSort(salesArr);
			
			case 2:
				return salesAmountSort(salesArr);
			
		}
		return salesArr;
			
	}
	public static Salesperson[] idSort(Salesperson[] sales) {
		Salesperson temp;
		for(int i=0; i<sales.length-1; i++) {
			for(int j=0; j<sales.length-1-i; j++) { // add a -i
				if(sales[j].idNumber >sales[j+1].idNumber) {
					
					temp = sales[j];
					sales[j]=sales[j+1];
					sales[j+1]=temp;
					
				}
			} 
		}
		return sales;
	}
	
	public static Salesperson[] salesAmountSort(Salesperson[] sales) {
		Salesperson temp;
		for(int i=0; i<sales.length-1; i++) {
			for(int j=0; j<sales.length-1-i; j++) { // add a -i
				if(sales[j].salesAmount >sales[j+1].salesAmount) {
					
					temp = sales[j];
					sales[j]=sales[j+1];
					sales[j+1]=temp;
					
				}
			} 
		}
		return sales;
	}
}
