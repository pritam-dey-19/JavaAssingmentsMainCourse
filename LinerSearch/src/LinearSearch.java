// find the value is present or not in an array

import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		int i,n,search;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the no of elements in the array : ");
		
		n=in.nextInt();
		
		int a[]=new int[n];
		
		for( i=0;i<a.length;i++) {
			a[i]=in.nextInt();
		}
		
		System.out.println("enter the value wanna search : ");
		search=in.nextInt();
		
		for( i=0;i<a.length;i++) {
			if(a[i]==search) {
				System.out.println(search + " Is present at loacation " +i);
				break;
			}
		}
		if(i==n) {
			System.out.println("the number does not present in the array");
		}

	}

}
