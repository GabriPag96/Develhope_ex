package Ex_52;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Torino", 1);
        map.put("Milano", 2);
        map.put("Roma", 3);
        map.put("Palermo", 4);

        Collection<Integer> values = map.values();

        List<Integer> sortedValues = new ArrayList<>(values);
        Collections.sort(sortedValues, Collections.reverseOrder()); //dal più grande al più piccolo

        System.out.println(sortedValues);

        List<Integer> sortedValues2 = new ArrayList<>(values);
        Collections.sort(sortedValues2); //dal più piccolo al più grande

        System.out.println(sortedValues2);
    }
}
