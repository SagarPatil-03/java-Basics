import java.util.*;

class RevWordString {

    // This program reverse words in a given String.
    public static void main(String args[]) {

        String s = "sagar Devidas Patil";

        String[] words = s.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            result.append(words[i]);

            if (i != 0) {
                result.append(" ");
            }
        }

        System.out.println(result.toString());
    }
}


 