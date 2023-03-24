package basicprogramming;
//Write a Java program that prompts the user to input an integer and then outputs the number with the digits reversed order

import java.util.*;
    public class reverse {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number = ");
            int a = sc.nextInt();
            int temp = 0;
            int rev = 0;
            while(a !=0) {  //21
                temp = a % 10; //2
                a = a / 10; //1
               // rev = rev*10 +temp;
                System.out.print(temp);
            }
        }
    }
