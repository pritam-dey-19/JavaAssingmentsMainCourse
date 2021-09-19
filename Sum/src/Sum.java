import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		int n,sum=0;
        
        Scanner sc=new Scanner(System.in);

        //enter the size of the array
        
        System.out.println("enter how many numbers you want sum: ");
         n=sc.nextInt();
         int a[]=new int[n]; 
         
         //enter the numbers we want to add in the array to sum
         
         System.out.println("enter the "+n+" numbers:  ");
         for(int i=0;i<n;i++)
         {      
        	 System.out.println("enter  number  "+(i+1)+": ");
                 a[i]=sc.nextInt();
         }
         for(int i=0;i<n;i++)
         {
                 sum+=a[i];
         }  	    
         System.out.println("sum of "+n+" numbers is = "+sum);                  
    	}


	}
