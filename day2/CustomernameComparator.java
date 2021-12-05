package day2;
import java.util.Comparator;

public class CustomernameComparator implements Comparator<customer_table_bookin_assignment24>{
	
	// sorting by name
	
	@Override
	public int compare(customer_table_bookin_assignment24 o1, customer_table_bookin_assignment24 o2) {
		/*
		 * if (o1.getSalary() < o2.getSalary()) return -1; if (o1.getSalary() ==
		 * o2.getSalary()) return 0; return 1;
		 */
		System.out.println("In Name Comparator ");
		
		return o1.getName().compareTo(o2.getName());
		
		
	}
	
	
}
