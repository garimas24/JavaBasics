//Write a Java program to convert a decimal number to binary numbers
package basicprogramming;
import java.util.*;
public class convert {
    public static void main(String args[]) {
      /*  int q = 25;
        while(q !=0) {
            int i = 0; int temp =0;
            i = q % 2;//1/0
            q = q / 2;    //12/6
            temp = i+temp;
            System.out.print(temp);
       }*/
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number = ");
        int c = sc.nextInt();
        String rev = "";
        while (c != 0){  //11//5
            int temp = c % 2;   //1//1
            c = c/2;     //5//2
            rev = temp + rev;
        }
        System.out.println(rev);
    }
}

//25/2=12-1p
//12/2=6-0
//6/2=3-0
//3/2=1-0
//1/2=0