//calculate the area and circumference of the circle


import java.util.*;


public class CalculateAreaAndCircumfarenceOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of cirle for calculating area and Circumference : ");
		
		int radius=sc.nextInt();
		float pi=3.14f;
		circumference(radius,pi);
		area(radius,pi);
		

	}
	public static void circumference(int r,float pi)
	{
		
		float result=2*pi*r;
		System.out.println("Circumference of circle is :"+result);
	}
	
	public static void area(int r,float pi)
	{
		
		float result=pi*r*r;
		System.out.println("Area of circle is :"+result);
	}

}


