//Spilt a string and reverse it using split portion
public class SplitString {

	public static void main(String[] args) {
		
		
		//split and the reverse every portion 
		
		
		String str="I am pritam Dey";
		String[] k= str.split(" ");
		String empty="";                     
		
		for(int i=0;i<k.length;i++) {
			
			String rev=k[i]+" ";
			
			for(int j=rev.length()-1;j>=0;j--) {
				
				String r=empty+rev.charAt(j);
				System.out.print(r);
				
			}
		}
		
		
		//reverse the portion while characters remains same as it was
		
		System.out.println("\n\nAnother method");
		
		String h="Geekster is my class room";
		String[] str1=h.split(" ");
		
		for(int i=(str1.length-1);i>=0;i--) {
			System.out.print(str1[i]+" ");
		}

	}

}
