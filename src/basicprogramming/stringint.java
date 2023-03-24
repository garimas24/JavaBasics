package basicprogramming;

//import java.util.Scanner;

//Wrap to convert a string to an integer
/*public class stringint {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
       // String a = sc.toString();
        String a = "300";
       // System.out.println(" Write a string -");
        //int i=Integer.parseInt(a);
        System.out.println(a);
    }
}*/
import java.util.*;
class Mypattern2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("input-");
        int n = sc.nextInt();
        for(int k=1;k<=n;k++){
            for(int j=1;j<=k;j++){
                for(int i=1;i<=j;i++)
                    System.out.print("");
            }
            System.out.println("*");
        }
    }
}