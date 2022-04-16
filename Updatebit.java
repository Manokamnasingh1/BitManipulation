
import java.util.*;
public class Updatebit {
    public static void main(String args[]){

        System.out.println("enter no");   // input number from user
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("postion"); // input postion from user
        int i= sc.nextInt();

        System.out.println("enter opration");
        int oper = sc.nextInt();

         //operation=1 : set , operation : clear

        int bitMask=1<<i;
        if(oper == 1) {

            //setbit
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

    }
}
