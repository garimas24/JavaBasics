
//Write a Java program that takes five numbers as input to calculate and print the average of the numbers
import java.util.*;
public class average {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("input first number-" );
        int num1 = sc.nextInt();
        System.out.println("input second number-" );
        int num2 = sc.nextInt();
        System.out.println("input third number-" );
        int num3 = sc.nextInt();
        System.out.println("input forth number-" );
        int num4 = sc.nextInt();
        System.out.println("input fifth number-" );
        int num5 = sc.nextInt();
        System.out.println("Average 0f number = "+ (num1 + num2 + num3 + num4 + num5)/5 );

    }
}
