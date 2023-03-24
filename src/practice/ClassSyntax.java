package practice;

public class ClassSyntax {

    // variable
    int x, y;

    // main()
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(subtract(1,2));
    }

    // method1()
    // syntax: _returnType_ _methodName_(<parameters>)
    static int add(int a, int b){
        return a+b;
    }

    // method2()
    static int subtract(int a, int b){
        return a-b;
    }
}
