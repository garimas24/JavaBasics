package practice.methods;
import java.util.*;
public class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range 1 = ");
        double a = sc.nextInt();
        System.out.println("Enter a range 2 = ");
        double b = sc.nextInt();
        for(double i =a;i<=b;i++){
        if(isPerfectsquare(i)) {
            System.out.println(i + " is square");
        }
        else
            System.out.println(i + " is not square");
    }
    }
    static boolean isPerfectsquare(double i){
    double sqrt= Math.sqrt(i);
    return ((sqrt-Math.floor(sqrt))==0);
    }

}
