import java.util.Comparator;
public class mySortMetric implements Comparator<Inventory>{

	@Override
	public int compare(Inventory o1, Inventory o2) {
		// TODO Auto-generated method stub
		if(o1.stock>o2.stock)
		{
			return -1;
		}
		else if (o1.stock<o2.stock)
		{
			return 1;
		}
			
		return 0;
	}

}
