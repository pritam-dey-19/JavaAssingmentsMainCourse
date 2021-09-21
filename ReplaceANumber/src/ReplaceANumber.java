
// replace a given number from the array with a zero

import java.util.*;

public class ReplaceANumber {

	public static void main(String[] args) {
		
		int [] a = {1,2,4,6,8,12,76,23,64};
		int num;
		boolean flag=false;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println(" Enter the number you wanna replace : ");
		
		num=in.nextInt();
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==num) {
				flag=true;
				a[i]=0;
				break;  // IF WE DO NOT USE THE BREAK KEY WORD IT WILL REPLACE DUPLICATE VALUES WHAT WE AND TO REPLACE
			}
		}
		if(flag==false) {
			System.out.println("the number did not found");
		}
		
		System.out.print(" Now the array is [ ");
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print("  "+a[i]);
		}
		
		System.out.print("  ]");

	}

}
