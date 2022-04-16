
import java.util.*;
public class Getbit {
    public static void main(String args[]){
        //int n =5;
       // int i=2;
        System.out.println("enter no");   // input number from user
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("postion"); // input postion from user
        int i= sc.nextInt();
        int bitMask=1<<i;
        if((bitMask &n)==0){
            System.out.println("bit is zero");

        }else{
            System.out.println("bit is one");
        }
    }

}
