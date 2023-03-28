package practice.loops;
import java.util.*;
public class PrimeNo {
    public static void main(String[] args) {
        int count = 0; //int n =0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a-");
       int n = sc.nextInt();

        for(int a = 1;a<=n; a++) {
            if (n % a == 0)
                count++;
        }
            if(count == 2)
                System.out.println("prime number ");
            else
                System.out.println("Not a prime number ");
        }
    }



