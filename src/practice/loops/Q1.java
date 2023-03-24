/*
* WAP to take two numbers as input from user & for each number in their range print:
*   - if they're palindrome: eg: 121, 11, 1551
*   - if they're armstrong: eg: 153 -> 1^3 + 5^3 + 3^3
* */
// input number from user
//        start loop until number not 0
//        get last digit
//        multiply current sum with 10 + last digit
//        divide input number by 10
//        check sum & input number

package practice.loops;
import  java.util.*;

public class Q1 {
    public static boolean isPalindrome(int num) {
        int x, temp = 0;
        int y = num;
        // z = 456
        while (num != 0) {//num = 456, 45, 4, 0
            x = num % 10;//x=6,5,4
            num = num / 10;//num = 45,4,0
            temp = temp * 10 + x;//temp=6, 60+5=65, 65*10+4=654
        }
            return (temp == y);//        temp = 654, z=456
        }

    public static void main(String[] args) {
        // x=0, t.emp=0
        Scanner sc = new Scanner(System.in);
      System.out.println("Write a number = ");
      int num = sc.nextInt();
        System.out.println("Write another number = ");
        int n = sc.nextInt(); // 456
        for(int i = num; i<= n; i++) {
            if(isPalindrome(i)) {
                System.out.println( i + " is a palindrome");
            }
            else {
                System.out.println( i + " is not a palindrome");
            }

        }
        // num = 456

    }
}
// write a method for checking if a number is palindrome:
// name: boolean isPalindrome(int n){}