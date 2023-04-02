package practice.methods;

import java.util.*;

public class pallindromeusingmethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number a - ");
        int a = sc.nextInt();
        System.out.println("Enter another number b - ");
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (isPallindrome(i)) {
                System.out.println(i + " number is a palindrome");
            } else
                System.out.println(i + " number not a pallindrome");
        }
    }

    static boolean isPallindrome(int i) {
        int x, temp = 0;
        int y = i  ;
        while (i != 0) {
            x = i % 10;
            i = i / 10;
            temp = temp * 10 + x;
        }
        return (temp == y);

    }

}
