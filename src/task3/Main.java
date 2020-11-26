package task3;

import java.awt.*;

public class Main {

    public static void main(String [] args) {

        Plane plane = new Plane(300000, 980, 2019, 10000, 280);
        Ship ship = new Ship(80000, 250, 2020, 1500, "Stambul");
        Vehicle car = new Vehicle(21000, 130, 2020);

        System.out.println("Plane :");
        System.out.print(plane.getPrice() + " " + plane.getSpeed() +
                " " + plane.getYearOfProduc() + " " + plane.getHigth() + " " + plane.getPassengerCount());
        System.out.println();
        System.out.println(" Ship :");
        System.out.print(ship.getPrice() + " " + ship.getSpeed() + " " + ship.getYearOfProduc() +
                        " " + ship.getPassengerCount() + " " + ship.getPort());
        System.out.println();
        System.out.println(" Car :");
        System.out.println(car.getPrice() + " " + car.getSpeed() + " " + car.getYearOfProduc());

    }
}
