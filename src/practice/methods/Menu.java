package practice.methods;

import java.util.*;

public class Menu {
    public static void main(String[] args) {
        while (true) {
            // sout the menu
            System.out.println("Input your choise ");
            // take menu-input
            System.out.println("Menu input-");
            System.out.println("1 Square");
            System.out.println("2 Prime");
            System.out.println("3 Pallindrome");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int j = sc.nextInt();
            // create if else ladder
            if (j == 1) {
                System.out.println("Enter the number -");
                int k = sc.nextInt();
                if (isPerfectsquare(k)) {
                    System.out.println(k + " is square");
                } else
                    System.out.println(k + " is not square");
            } else if (j == 2) {
                System.out.println("Enter a number -");
                int z = sc.nextInt();
                if (isPrime(z)) {
                    System.out.println(z + " is prime");
                } else
                    System.out.println(z + " is not prime");
            } else if (j == 3) {
                System.out.println("Enter a number -");
                int i = sc.nextInt();
                if (isPallindrome(i)) {
                    System.out.println(i + " number is a palindrome");
                } else
                    System.out.println(i + " number not a pallindrome");
            }
            else{
                break;
            }
        }

    }

    static boolean isPerfectsquare(double num) {
        double sqrt = Math.sqrt(num);
        return ((sqrt - Math.floor(sqrt)) == 0);
    }

    static boolean isPrime(int z) {
        int count = 0;
        int n = z;
        for (int a = 1; a <= 100; a++) {
            if (n % a == 0)
                count++;
        }
        if (count == 2)
            return true;
        else
            return false;
    }

    static boolean isPallindrome(int i) {
        int x, temp = 0;
        int y = i;
        while (i != 0) {
            x = i % 10;
            i = i / 10;
            temp = temp * 10 + x;
        }
        return (temp == y);

    }

}
