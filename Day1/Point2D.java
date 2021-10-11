package com.basics;

public class Point2D {
	
	int x_cor,y_cor;
			
	//Parametric constructor
	public Point2D(int x,int y) {
		this.x_cor=x;
		this.y_cor=y;
		System.out.println("x and y are "+x_cor+" and "+y_cor);
		
		
	}
	
	//get details method to print string of the coordinates
	public String getDetails(int x,int y)
	{
		return "Point ("+x+","+y+")";
		
	}
	
	//Return boolean value if the coordinates are equal or unequal
	public boolean isEqual(int x,int y)
	{
		if(x==x_cor && y==y_cor)
			return true;
			
		else
			return false;
			
	}
	
	
	
	//a method to return offset of the coordinates
	public void createNewPoint(int xoff,int yoff) 
	{
		int a= x_cor+xoff;
		int b = y_cor+yoff;
		
		//return (a);
	System.out.print(a);
	System.out.print(",");
	System.out.println(b);
		
	}
	
	
	public static void main(String[] args) 
	{
		
		
		
		Point2D obj1 = new Point2D(10,15);

		
		
		boolean a=obj1.isEqual(10,15);
		System.out.println(a);
		
		System.out.println(obj1.getDetails(1,2));
		obj1.createNewPoint(1,2);
		
		
		
		
	}
	
}
