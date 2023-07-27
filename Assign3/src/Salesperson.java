
public class Salesperson {
	int idNumber;
	double salesAmount;
	
	Salesperson(int idNumber, double salesAmount) {
		this.idNumber=idNumber;
		this.salesAmount=salesAmount;
	}
	
	@Override
	public String toString() {
		StringBuilder sales = new StringBuilder();
		sales.append("Sales ID: " + this.idNumber + "\n");
		sales.append("Sales Amount: " + this.salesAmount + "\n");
		sales.append("---------------------------- \n");
		
		return sales.toString();
	}
}
