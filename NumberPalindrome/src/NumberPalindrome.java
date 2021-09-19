// write a java programe to find out weather the number is a palindrome or not

import java.util.*;
public class NumberPalindrome {

	public static void main(String[] args) {
		int num,tempNum,rem,sum=0;
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter the number : ");//enter the checked number
		
		num=in.nextInt();
		
		tempNum=num;
		
		while(num>0) {
			rem=(num%10);//getting reminder
			sum=(sum*10)+rem;//adding up the digits
			num=num/10;//dividing the number
		}
		if(tempNum==sum) {
			System.out.println("the given number is a  PALINDROME");
		}
		else {
			System.out.println("the given number is NOT PALINDROME");
		}

	}

}
