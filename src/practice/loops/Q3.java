package practice.loops;

public class Q3 {
    public static void main(String[] args) {
        int digit = 0;
        int n= 124;
        while(n!=0){
            int temp = n%10;
            digit = temp;
            n = n/10;
            System.out.println(digit);
        }
    }
}
