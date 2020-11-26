package task3;

public class Vehicle {
 private double price;
  private int speed;
  private int yearOfProduc;

    public Vehicle(double price, int speed, int yearOfProduc) {
        this.price = price;
        this.speed = speed;
        this.yearOfProduc = yearOfProduc;
    }

    public double getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYearOfProduc() {
        return yearOfProduc;
    }
}

