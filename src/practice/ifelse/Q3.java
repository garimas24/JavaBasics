package practice.ifelse;
//Q: Take 3 int values from user and print greatest among them.
import java.util.*;
public class Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no =");
        int a = sc.nextInt();
        System.out.print("enter b no =");
        int b = sc.nextInt();
        System.out.print("enter c no =");
        int c = sc.nextInt();
           if(a > b)
               if (a > c){
                   System.out.print(a);
               }
           else {
                   System.out.println(c);
               }
           if(a < b)
               if(b > c){
                   System.out.println(b);
               }
           else {
                   System.out.println(c);
               }


        /*
        a, b, c
        1, 2, 3
        2, 1, 3
        1, 3, 2
        3, 1, 2
        3, 2, 1
        *
        if(a > b){
            if(a > c){
                biggest is a
            }
            else{
                biggest is c
            }
         }
         else if(b > a){
            if(b > c){
                biggest is b
            }
            else{
                biggest is c
            }
         }
        * */


    }
}
