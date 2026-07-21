import java.util.*;

public class FirstDuplicate {
    public static void main(String[] args) {
        List<Integer> transactionIds = Arrays.asList(101, 102, 103, 102, 104, 105);

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (Integer id : transactionIds) {
            map.put(id, map.getOrDefault(id, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("First Duplicate Transaction ID: " + entry.getKey());
                break;
            }
        }
    }
}