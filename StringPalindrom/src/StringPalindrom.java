// write a program in java to check wheather the given string is a palindrome or not
import java.util.*;
public class StringPalindrom {

	public static void main(String[] args) {
		String a,b="";
		Scanner in=new Scanner(System.in);
		
		//enter the string to be checked
		
		System.out.print("Enter the string want to check: ");
		a=in.nextLine();
		int n=a.length();
		
		//reverse the string in an another vaariable
		
		for(int i=n-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		
		//compair the both string weather same or not
		
		if(a.equalsIgnoreCase(b)) {
			System.out.println("the given string is PALINDROME");
		}
		else {
			System.out.println("the given string is NOT PALINDROME");
		}
		

	}

}
