abstract class vehicle {
    abstract void start();
    void stop(){
        System.out.println("Vehicle stopped.");
    }
}
class Car extends vehicle {
    void start() {
        System.out.println("Car started.");
    }
}
class Bike extends vehicle {
    void start() {
        System.out.println("Bike started.");
    }
}
class Bus extends vehicle {
    void start() {
        System.out.println("Bus started.");
    }
}
public class vech {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();

        Bike bike = new Bike();
        bike.start();
        bike.stop();

        Bus bus = new Bus();
        bus.start();
        bus.stop();
    }
    
}
