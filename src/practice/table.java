//Write a Java program that takes a number as input and prints its multiplication table upto 10.
package practice;

import java.util.*;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a -");
        int a = sc.nextInt();
        System.out.println("Enter the value of b- ");
        int b = sc.nextInt();
        for (int n=1;n<=a;n++) {
            for(int j=1;j<=b;j++){
                System.out.println(n + " X " + j +" = "+ n*j);
           }
        }
    }
}
