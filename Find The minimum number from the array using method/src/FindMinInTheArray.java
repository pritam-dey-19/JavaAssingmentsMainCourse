//write a java program to find the minimum number in the array using method


import java.util.*;
public class FindMinInTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		int [] value=new int[5];
		
		System.out.println("Enter the values in the Array :  ");
		min(value,in);
		
		

	}
	
	public static void min(int [] value,Scanner in) {
		
		for(int i=0;i<value.length;i++) {
			value[i]=in.nextInt();
			
		}
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<value.length;i++) {
			if(value[i]<min) {
				
				min=value[i];
				
			}
		}
		
		System.out.println(" The minimum value of the Array is :  "+min);
	}

}
