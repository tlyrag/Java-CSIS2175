import java.util.Comparator;
public class  MyComparator implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		// TODO Auto-generated method stub
		if(o1.millage>o2.millage) {
			return 1;
		}
		else if(o1.millage<o2.millage) {
			return -1;
		}
		return 0;
	}

}
