package practice.ifelse;
/*A school has following rules for grading system:
        a. Below 25 - F
        b. 25 to 45 - E
        c. 45 to 50 - D
        d. 50 to 60 - C
        e. 60 to 80 - B
        f. Above 80 - A
        Ask user to enter marks and print the corresponding grade.*/
import java.util.*;
public class Q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no = ");
        int N = sc.nextInt();
        if(N >=80){
        System.out.print("A");
        }
        else if (N>=60 && N<80){
            System.out.print("B");
        }
        else if (N>=50 && N<60){
            System.out.print("C");
        }
        else if (N>=45 && N<50){
            System.out.print("D");
        }
        else if (N >=25 && N <45 ){
            System.out.print("E");
        }
        else{
            System.out.print("F");
        }
    }
}
