package day2;

import java.util.Comparator;

public class CustomeramountComparator implements Comparator<customer_table_bookin_assignment24> {

	@Override
	public int compare(customer_table_bookin_assignment24 o1, customer_table_bookin_assignment24 o2) {
		// TODO Auto-generated method stub
		System.out.println("In average spend amount Comparator ");
		
	
		return ((Double)(o1).getAverageSpendAmount()).compareTo((Double)(o2).getAverageSpendAmount());
		
	}

}
