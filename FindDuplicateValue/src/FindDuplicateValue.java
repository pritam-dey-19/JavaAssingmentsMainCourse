// find the duplicate value in an array

import java.util.*;

public class FindDuplicateValue {

	public static void main(String[] args) {
		int n,count=0;
		Scanner in=new Scanner(System.in);
		System.out.println(" enter the number of element in the array : ");
		
		n=in.nextInt(); //enter the no of elements in the array
		
		int a[]=new int[n];
		
		//enter elements in array
		
		for(int i=0;i<a.length;i++) {
			a[i]=in.nextInt();
		}
		
		//checking is there any duplicate value
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					//System.out.println(a[j]);
					count++;
				}
			}
		}
		System.out.println(count);
		
		

	}

}
