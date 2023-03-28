package practice.loops;

import java.util.Scanner;

public class PrimeNo2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            int n = i;
            for (int a = 1; a <= n; a++) {
                if (n % a == 0)
                    count++;
            }
            System.out.print(n + " " );
            if (count == 2)
                System.out.println("prime number ");
            else
                System.out.println("Not a prime number ");
        }
    }
}

