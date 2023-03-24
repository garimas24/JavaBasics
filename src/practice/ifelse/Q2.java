package practice.ifelse;
//A student will not be allowed to sit in exam if his/her attendence is less than 75%.
        //Take following input from user
        //Number of classes held
        //Number of classes attended.
        //And print
        //percentage of class attended
//Is student is allowed to sit in exam or not.//

 import java.util.*;
public class Q2 {
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
            System.out.println("no of Classes held -");
            double Class = sc.nextDouble();
        System.out.println("no of  Classes attended -");
        double Attended = sc.nextDouble();
        double p = (Attended/Class)*100;
        System.out.println(p);
        if(p >= 75){
            System.out.println("Allowed to sit");
        }
        else{
            System.out.println("not Allowed");
        }

    }

}
