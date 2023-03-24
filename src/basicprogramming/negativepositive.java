package basicprogramming;
//Write a Java program that reads an integer and check whether it is negative, zero, or positive


import java.util.*;
public class negativepositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int s = sc.nextInt();
        if (s>0)
            System.out.println("Positive number");
            else if(s<0)
                System.out.println("Negative number");
            else
            System.out.println("zero");
    }
}
