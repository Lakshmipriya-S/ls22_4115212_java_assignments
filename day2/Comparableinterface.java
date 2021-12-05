package day2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import day2_assignment22.Customer;

public class Comparableinterface {
	
	public static customer_table_bookin_assignment24 createCustomer(String line) {
		String[] array = line.split(",");
		
		Date birthdate = null,  dateEnrolled  = null;
		
		try {
			birthdate = parseDate(array[3], "dd-MM-yyyy");
			dateEnrolled = parseDate(array[6], "dd-MM-yyyy");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new customer_table_bookin_assignment24(Long.parseLong(array[0]), array[1], array[2], birthdate, 
				Double.parseDouble(array[4]), Double.parseDouble(array[5]), dateEnrolled, Double.parseDouble(array[7]));
	}
	

private static java.util.Date parseDate(String date, String format) throws ParseException
{
    SimpleDateFormat formatter = new SimpleDateFormat(format);
    return formatter.parse(date);
}
	
}
