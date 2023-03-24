//Q:hackerrank: https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
/*Given an integer, , perform the following conditional actions:
        If n is odd, print Weird
        If n is even and in the inclusive range of  to , print Not Weird
        If n is even and in the inclusive range of  to , print Weird
        If n is even and greater than , print Not Weird
        Complete the stub code provided in your editor to print whether or not  is weird.*/

import java.util.Scanner;
public class Ifelse4 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*int N = scanner.nextInt();
        if(N%2 == 1){
            System.out.print("Weird");
        }
        if(N%2==0 && N>=2 && N<=5){
            // System.out.print("reaching here @line22");
            System.out.print("Not Weird");
        }
        if(N%2==0 && N>=6 && N<=20){
            System.out.print("Weird");
        }
        else if (N%2 == 0 && N>20)
        {
            // System.out.print(N%2);
            // System.out.print("reaching here @line30");
            System.out.print("Not Weird");
        }

        scanner.close();*/

        int N = scanner.nextInt();
        // if N is odd
        if(N%2 == 1 || N==1){
            System.out.print("Weird");
        }

        // if N is even
        if(N%2 == 0){
            if(N>=2 && N<=5){
                System.out.print("Not Weird");
            }
            else if(N>=6 && N<=20){
                System.out.print("Weird");
            }
            else {
                System.out.print("Not Weird");
            }
        }
        scanner.close();

    }
}

