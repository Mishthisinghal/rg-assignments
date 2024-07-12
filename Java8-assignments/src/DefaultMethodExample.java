interface Vehicle {
    void start();

    default void displayInfo() {
        System.out.println("Vehicle information.");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starting.");
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();          // Implemented method
        car.displayInfo();    // Default method from interface
    }
}

