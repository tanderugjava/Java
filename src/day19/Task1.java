package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\Desktop\\Java\\src\\resources\\dushi.txt");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("[.,:;()?!\"\\s–]+");
        Map<String, Integer> map = new HashMap<>();
        ValueComparator vC = new ValueComparator(map);
        TreeMap<String, Integer> sortMap = new TreeMap<>(vC);

        while (scanner.hasNextLine()) {
            String word = scanner.next();
            Integer count = map.get(word);
            map.put(word, count == null ? 1 : count+1);
        }
        /*System.out.println(map.get("Чичиков"));*/ //Чичиков - 601

        sortMap.putAll(map);

        List<Map.Entry> list = new ArrayList<>(sortMap.entrySet());

        for (int i = 0; i < 100; i++) {
            System.out.println((i + 1) + ") " + list.get(i));
        }
    }
}
class ValueComparator   implements Comparator<String> {
    Map<String, Integer> maps;

    public ValueComparator (Map<String, Integer> maps) {
        this.maps = maps;
    }

    @Override
    public int compare(String a, String b) {
        if (maps.get(a) >= maps.get(b)) {
            return -1;
        } else {
            return 1;
        }
    }
}

