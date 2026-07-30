import java.util.HashMap;

public class LongestSubstring {

    public static void main(String[] args) {

        String s = "abcabcbb";

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if(map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }

            map.put(ch, right);

            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println("Imp To Competitive Exam");
        System.out.println("Maximum Longest Substring :-"+maxLength);
    }
}