// Write a Java program that takes a year from user and print whether that year is a leap year or not
package practice.ifelse;
import java.util.*;
public class Q5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the year =");
        int m = sc.nextInt();
        if(m % 4 == 0) {
            System.out.print("Leap Year");
        }
        else{
            System.out.print("Not Leap Year");
        }
    }
}
