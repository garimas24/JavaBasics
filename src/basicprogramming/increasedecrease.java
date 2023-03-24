package basicprogramming;
//Wrap that accepts three numbers from the user and check if numbers are in “increasing” or “decreasing” order
    import java.util.*;
    public class increasedecrease {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number =");
            int a = sc.nextInt();
            System.out.println("enter another number = ");
            int b = sc.nextInt();
            System.out.println("enter another number = ");
            int c = sc.nextInt();
            if(a>b &&b>c)
                System.out.println("increasing order");
            else
                System.out.println("decreasing order");


        }

}
