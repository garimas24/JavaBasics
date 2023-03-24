package practice.loops;
// WAP to check if a string is palindrome
public class Q2 {
    public static void main(String[] args) {
        int a = 153;
            int digit = 0;
            while(a!=0){
                a = a/10;
                int temp = a%10;
                digit = temp;
                System.out.print(digit);

        }

    }
}
