/*Write a Java program that inputs a number from the user between 1 and 7 and
displays the name of the weekday. */

package practice.switchCase;

import java.util.*;

public class Q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("input a no");
        int u = sc.nextInt();
        switch (u){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;


        }

    }

}
