
import java.util.*;
public class Setbit {
    public static void main(String args[]){
        //int n =1;
        // int i=1;
        System.out.println("enter no");   // input number from user
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("postion"); // input postion from user
        int i= sc.nextInt();
        int bitMask=1<<i;
        int newNumber= bitMask|n;
        System.out.println(newNumber);


        }
    }

