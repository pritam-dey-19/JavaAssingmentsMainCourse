import java.util.Scanner;

public class VotingAge {

    public  boolean validation(int age){
        if (age>18){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        VotingAge ch=new VotingAge();
        Scanner s=new Scanner(System.in);
        int i= s.nextInt();
        if (ch.validation(i)==true){
            System.out.println("YOU ARE ELIGIBLE");
        }
        else {
            System.out.println("YOU ARE NOT ELEGIBLE");
        }
    }
}