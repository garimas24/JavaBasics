package practice.loops;
// WAP to print sum of its digits:
//for eg: 123 -> 6
//hint use % 10

public class Q0 {
    // assign sum as 0
    // loop until number > 0
    //   get last digit of number
    //   add it to the sum
    //   divide number by 10
    // print the sum of number
    public static void main(String[] args) {
        int sum = 0;
        int n =321;
        while(n !=0)
        {
            sum = sum + (n % 10);
            n=n/10;
        }

        System.out.print(sum);

    }
    }