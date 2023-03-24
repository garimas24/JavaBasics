
public class LamdaMultithreading{
    public static void main(String[] args) {
        Runnable r = () -> {
            for(int i=0; i<10000; i++){
                System.out.println("Coming from child thread");
            }
        };

        Thread t = new Thread(r);
        t.start();
        for(int i=0; i<10000; i++){
            System.out.println("Coming from main thread");
        }
    }
}
