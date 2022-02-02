package alok;
import java.util.*;

public class PriceComp implements Comparator<Order>{

	public int compare(Order ord1, Order ord2) {
		if(ord1.price== ord2.price)
			return ord1.productName.compareTo(ord2.productName);
					
		else if(ord1.price<ord2.price) {
			return 1;
		}
		else
			return -1;
	}

}
