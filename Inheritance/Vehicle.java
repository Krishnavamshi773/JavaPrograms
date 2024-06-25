package Inheritance;

//superclass

public class Vehicle {

  String name;
  int speed;
  int no_ofWheels;

  void vehicleInfo() {
      System.out.println("Vehicle Info:\nVehicle Name: " + name + "\nSpeed: " + speed + "\nNumber of Wheels: " + no_ofWheels);
  }
}