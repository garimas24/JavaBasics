/*Write a Java program that inputs a number from the user between 1 and 7 and
displays the name of the weekday. */
package practice.ifelse;
import java.util.*;
public class Q4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no =");
        int d = sc.nextInt();
        if(d == 1) {
            System.out.println("Monday");
        }
            else if(d == 2){
                System.out.println("Tuesday");
            }
            else if (d== 3){
                System.out.println("Wednesday");
            }
            else if(d==4){
            System.out.println("Thusday");
        }
            else if(d==5){
            System.out.println("Friday");
        }
            else if(d==6){
            System.out.println("Saturday");
        }
            else{
            System.out.println("Sunday");
        }




    }
}
