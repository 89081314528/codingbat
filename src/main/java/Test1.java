import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        boolean cartHasProduct = false;
        for (int i = 0; i < 5; i++) {
            if (i == 6) {
                cartHasProduct = true;
                System.out.println(cartHasProduct);
                return;
            }
        }
        System.out.println(cartHasProduct);

        List<Integer> list = new ArrayList<>(List.of(1, 5, 2, 3, 5, 1));
        System.out.println(list);
        list.remove((Integer) 5);
        System.out.println(list);
         Map<Integer, Integer> map = new HashMap<>();

         map.put(null, null);
    }
}
