 import java.util.*;
public class FrequencyCount {


    

public static void main(String args[])
{
        String str = "banana";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Frequency count :-");
        System.out.println(map);
    }
}

    

