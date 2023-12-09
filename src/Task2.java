import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> personsData = new HashMap<>();
        personsData.put(13, "Peter");
        personsData.put(25, "Alex");
        personsData.put(7, "Sacha");
        personsData.put(9, "Sam");
        personsData.put(20, "Darya");

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(9);
        numbers.add(13);

        List<StringBuilder> newList = personsData.entrySet().stream()
                .filter(person -> numbers.contains(person.getKey()))
                .filter(person -> person.getValue().length() % 2 != 0)
                .map(person -> new StringBuilder(person.getValue()).reverse())
                .collect(Collectors.toList());

        System.out.println(newList);
    }
}

