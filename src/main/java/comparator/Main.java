package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(2200, 150));
        cars.add(new Car(2000, 110));
        cars.add(new Car(1900, 50));
        cars.add(new Car(2000, 100));
        System.out.println(cars);

        CarComparator comparator = new CarComparator();
        Collections.sort(cars, comparator);
        System.out.println(cars);
    }
}
