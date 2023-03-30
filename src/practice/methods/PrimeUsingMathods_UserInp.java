package practice.methods;

// inp range of 2 number, print prime/not prime; implement using methods
import java.util.*;
public class PrimeUsingMathods_UserInp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter the range of 1 -");
        int a = sc.nextInt();
        System.out.println("Enter the range of 2- ");
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if(isPrime(i)){
                System.out.println(i + " is prime");
            }
            else
                System.out.println(i + " is not prime");
        }
    }
    static boolean isPrime(int i){
        int count = 0;
        int n = i;
        for (int a = 1; a <= n; a++) {
            if (n % a == 0)
                count++;
        }
        if (count == 2)
//            System.out.println(n + "is prime number ");
            return true;

        else
//            System.out.println(n + "is not a prime number ");
            return false;
    }
}

