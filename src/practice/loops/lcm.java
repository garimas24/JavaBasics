package practice.loops;
import java.util.*;
public class lcm {
    public static void main(String[] args) {
        int max, step, vcm =0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a -");
        int a = sc.nextInt();
        System.out.println("Enter the value of b- ");
        int b = sc.nextInt();
        if(a > b){
            max = step = a;
        }
        else{
            max = step = b;
        }
        while(a != 0) {
            if (max % a == 0 && max % b == 0) {
                vcm = max;
                break;
            }
            max += step;
        }
        System.out.println("lcm of a,b = "+ vcm);
    }

}

