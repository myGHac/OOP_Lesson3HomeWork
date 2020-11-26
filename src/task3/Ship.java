package task3;

public class Ship extends Vehicle {
    private int passengerCount;
    private String port;

    public Ship(double price, int speed, int yearOfProduc, int passengerCount, String port) {
        super(price, speed, yearOfProduc);
        this.passengerCount = passengerCount;
        this.port = port;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public String getPort() {
        return port;
    }
}

