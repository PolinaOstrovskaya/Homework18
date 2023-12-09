import java.util.ArrayList;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(34);
        list.add(3457);
        list.add(20);
        list.add(220);
        list.add(34);
        int result = list.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .reduce(0, (a, b) -> a + b);
        System.out.println(result);
    }
}
