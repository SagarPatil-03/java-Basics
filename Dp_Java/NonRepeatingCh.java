import java.util.LinkedHashMap;
import java.util.Map;

// Most Of Company asking the VVIMP.
public class NonRepeatingCh {

    public static void main(String[] args) {

        String str = "swiss";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}