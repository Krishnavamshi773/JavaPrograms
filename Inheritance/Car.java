package Inheritance;

public class Car extends Vehicle {

    String model;
    String fuel;
    String color;
    SonyMusicSystem sonyMusic;

    void carDetails() {
        System.out.println("Car Details:\nModel: " + model + "\nFuel: " + fuel + "\nColor: " + color +
                "\nMusic System details: Model - " + sonyMusic.model + ", Price - " + sonyMusic.price +
                ", Volume - " + sonyMusic.volume);
    }

    public static void main(String[] args) {
        Car benz = new Car();
        String n = "Benz";
        benz.name = n;
        benz.no_ofWheels = 4;
        benz.speed = 308;
        benz.color = "Black";
        benz.model = "EQS";
        benz.fuel = "Petrol";

        // Creating a SonyMusicSystem object and initializing its properties
        benz.sonyMusic = new SonyMusicSystem();
        benz.sonyMusic.model = "SonyXYZ"; // Example value
        benz.sonyMusic.price = 100; // Example value
        benz.sonyMusic.volume = 10; // Example value

        benz.vehicleInfo();
        benz.carDetails();
    }
}

class SonyMusicSystem {
    String model;
    double price;
    int volume;
}

