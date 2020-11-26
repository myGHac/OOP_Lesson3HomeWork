package task3;

public class Plane extends Vehicle {
 private int higth;
 private int passengerCount;

 public Plane(double price, int speed, int yearOfProduc, int higth, int passengerCount) {
  super(price, speed, yearOfProduc);
  this.higth = higth;
  this.passengerCount = passengerCount;
 }

 public int getHigth() {
  return higth;
 }

 public int getPassengerCount() {
  return passengerCount;
 }
}

