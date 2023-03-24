package practice.loops;
public class PrimeNo {
    int n ;
    int count = 0;
    public static void main(String[] args) {
        for(int a = 1;a<=n;a++){
                if(n % a==0) {
                    count++;
                }
            }
            if(count == 2)
                System.out.println("prime number ");
            else
                System.out.println("Not a prime number ");
        }
    }



