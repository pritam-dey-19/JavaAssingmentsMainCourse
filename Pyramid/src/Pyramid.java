
// construct a pyramid structure using java

import java.util.*;

public class Pyramid {

	public static void main(String[] args) {
		
		int row;
		Scanner in=new Scanner(System.in);
		
		System.out.println(" enter the rows you want :  ");
		
		row=in.nextInt();
		
		for(int i=0;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
		
		

	}

}
