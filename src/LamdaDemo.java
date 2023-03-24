public class LamdaDemo {
    public static void main(String[] args) {
        LamdaFunctionalInterface lfi = () -> System.out.println("This is from Lambda exp");
        lfi.m1();
    }
}

interface LamdaFunctionalInterface{
    public abstract void m1();
}
