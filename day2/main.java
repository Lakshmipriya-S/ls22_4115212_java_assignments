package day2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main {
	
	public static void main(String[] arges) {
		
		System.out.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s %s\n", "Id","Name","MobileNumber","Date of Birth","Average spent amount","Total amount","Date Enrolled","Rating");
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of customers");
			Comparableinterface ci=new Comparableinterface();
			int numberOfCustomers=sc.nextInt();
			List <customer_table_bookin_assignment24> customerList =new ArrayList<customer_table_bookin_assignment24>();
			
			while (numberOfCustomers != 0) {
				customerList.add(ci.createCustomer(sc.next()));
				numberOfCustomers--;
			}
			System.out.println("Enter a type of sort\n1.Name\n2.Amount Spent\n3.Rating");
			int search=sc.nextInt();
			if(search==1) {
				
				System.out.println("------Before Sorting by name-------");
				for(customer_table_bookin_assignment24 e: customerList)
				{
					System.out.println(e);
				}
				System.out.println("------After Sorting By Name------");
				
				Collections.sort(customerList, new CustomernameComparator());
				for(customer_table_bookin_assignment24 e: customerList)
				{
					System.out.println(e);
				}
				
			}
			else if(search==2) {
		
				
				System.out.println("------Before Sorting by amount-------");
				for(customer_table_bookin_assignment24 e: customerList)
				{
					System.out.println(e);
				}
				System.out.println("------After Sorting By amount------");
				
				Collections.sort(customerList, new CustomeramountComparator());
				for(customer_table_bookin_assignment24 e: customerList)
				{
					System.out.println(e);
				}
				
				
				
			}
			else {
				
				System.out.println("------Before Sorting by rating-------");
				for(customer_table_bookin_assignment24 e: customerList)
				{
					System.out.println(e);
				}
				System.out.println("------After Sorting By rating------");
				
				Collections.sort(customerList, new CustomerratingComparator());
				for(customer_table_bookin_assignment24 e: customerList)
				{
					System.out.println(e);
				}
				
				
			}
		}
		
	
	}
	private static java.util.Date parseDate(String date, String format) throws ParseException
	{
	    SimpleDateFormat formatter = new SimpleDateFormat(format);
	    return formatter.parse(date);
	}

}
