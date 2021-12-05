package day2;

public class customer_table_bookin_assignment24 {
	
	private Long id;
	private String name;
	private String mobilenumber;
	private java.util.Date birthdate;
	private Double averageSpendAmount;
	private Double totalAmount;
	private java.util.Date dateEnrolled;
	private Double rating;
	

	
	//constructor
	public customer_table_bookin_assignment24(Long id,String name,String mobilenumber,java.util.Date birthdate,Double averageSpendAmount,Double totalAmount,java.util.Date dateEnrolled,Double rating) {
		super();
		this.id=id;
		this.name=name;
		this.mobilenumber=mobilenumber;
		this.birthdate=birthdate;
		this.averageSpendAmount=averageSpendAmount;
		this.totalAmount=totalAmount;
		this.dateEnrolled=dateEnrolled;
		this.rating=rating;
		
	}
	
	//Getter and setter for all the features
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public java.util.Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(java.util.Date birthdate) {
		this.birthdate = birthdate;
	}
	public Double getAverageSpendAmount() {
		return averageSpendAmount;
	}
	public void setAverageSpendAmount(Double averageSpendAmount) {
		this.averageSpendAmount = averageSpendAmount;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public java.util.Date getDateEnrolled() {
		return dateEnrolled;
	}
	public void setDateEnrolled(java.util.Date dateEnrolled) {
		this.dateEnrolled = dateEnrolled;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	
	public void print(String temp) {
		System.out.println("printing from customer table "+temp);
	}

	@Override
	public String toString() {
		return "customer_table_bookin_assignment24 [id=" + id + ", name=" + name + ", mobilenumber=" + mobilenumber
				+ ", birthdate=" + birthdate + ", averageSpendAmount=" + averageSpendAmount + ", totalAmount="
				+ totalAmount + ", dateEnrolled=" + dateEnrolled + ", rating=" + rating + "]";
	}
	
	public customer_table_bookin_assignment24(long id) {
		super();
		this.id = id;
	}
	
	public int compareTo(customer_table_bookin_assignment24 o) {
		System.out.println("in compareTo");
		if(this.id<o.getId())
			return -1;
		if(this.id==o.getId())
			return 0;
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
	
		System.out.println("In Equals of Emp");
		 if(obj instanceof customer_table_bookin_assignment24)
		return this.id==((customer_table_bookin_assignment24)obj).id;
	 return false;
		
	}
	

}
