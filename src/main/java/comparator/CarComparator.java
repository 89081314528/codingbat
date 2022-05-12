package comparator;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getYear() == o2.getYear()) {
            return o1.getSpeed() - o2.getSpeed();
        } else {
            return o1.getYear() - o2.getYear();
        }
    }
}
