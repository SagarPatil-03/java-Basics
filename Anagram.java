import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String s1 = "race";
        String s2 = "care";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a, b)) {
            System.out.println("Given String is Anagram String");
        } else {
            System.out.println("Given String is Not Anagram String");
        }
    }
}