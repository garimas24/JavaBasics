// input from user: name, age, gender -> print them:
// eg: User's name: Garima
// User's age : 25
// User's gender: F
// OUT: Garima's age is 25 & gender is 'F'
import java.util.*;
public class InputOutput1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("user's name :");
        String name = sc.nextLine();
        System.out.print("User's age :" );
        int age = sc.nextInt();
        System.out.print("user's gender");
        char gender = sc.next().charAt(0);

        System.out.print(name+ "'s age is " + age + " & gender is " + gender);


    }
}
