package udemy_learning;

public class MotorBikerunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();
        ducati.start();
        honda.start();

        ducati.speed = 100;
        honda.speed = 80;
    }

}
