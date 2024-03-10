public class MainCar {


    public static void main(String[] args) {
        Car audi = new Car();
        audi.model = "Audi";
        audi.speed = 10;
        System.out.println("Model " + audi.model + " Hizi : " + audi.speed);

        audi.increaseSpeed(20);
        audi.printSpeed();

    }
}
