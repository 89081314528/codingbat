import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NoX {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("ax");
        strings.add("bb");
        strings.add("cx");

        List<String> result =
        strings.stream()
                .map(e -> {
                    String a = "";
                    int i;
                    for (i = 0; i < e.length(); i++) {
                        if (e.charAt(i) != 'x') {
                            a = a + e.charAt(i);
                        }
                    }
                    return a;
                })
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
