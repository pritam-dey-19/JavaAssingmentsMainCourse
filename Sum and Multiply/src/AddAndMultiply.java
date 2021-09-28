import java.util.*;


public class AddAndMultiply {
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("");
		int a=in.nextInt();
		System.out.println("");
		int b=in.nextInt();
		
		int add=add(a,b);
		
		System.out.println(" the sum is : "+add);
		
		int mul= multiply(a,b);
		
		System.out.println(" the multiplication is : "+mul);
		
		

	}

}
