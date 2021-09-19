import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		
		//how many element you want in the array
		
		System.out.print("how many element you want in the array: ");
		n=in.nextInt();
		
		int a[]=new int[n];
		
		//enter elements in the array
		
		for(int i=0;i<n;i++) {
			System.out.println("enter  number  "+(i+1)+": ");
            a[i]=in.nextInt();
		}
		
		//find out the largest number
		
		int max = a[0];
		for(int i = 1; i < n;i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.print("the largest number in this array is : "+max);
		

	}

}
