package comparator;

public class Car {
    private final int year;
    private final int speed;

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", speed=" + speed +
                '}';
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(int year, int speed) {
        this.year = year;
        this.speed = speed;
    }
}
