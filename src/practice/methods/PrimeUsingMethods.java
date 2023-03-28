package practice.methods;

public class PrimeUsingMethods {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
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


// methods:
/*
syntax: return-type method-name(data-type paramName){
        .
        .
        }

methods: used for modularization & better readability of code
1) Command+K : commit code(saving with a message in local sys)
2) Command+Shift+K: push(saving previous saved stage in server)
*/
