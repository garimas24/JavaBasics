import jdk.jfr.internal.tool.Main;

public class Person {
    //name age gender
    String name;
    int age;
    String gender;

    static void walk(){
     System.out.print("man is walking");
    }
    static void talk(){
        System.out.print("man is talking");
    }
    public static void main(String args[]){
     walk();
     talk();
    }
}
