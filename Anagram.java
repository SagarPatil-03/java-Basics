import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String s1 = "race far";
        String s2 = "care rAf";


        s1=s1.replaceAll("\\s+","").toLowerCase();
        s2=s2.replaceAll("\\s+","").toLowerCase();
         // toLowerCase() Or toUpperCase()

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

       // This is  for anagram program .

        if(Arrays.equals(a, b)) {
            System.out.println("Given String is Anagram String.");
        } else {
            System.out.println("Given String is Not Anagram String.");
        }
    }
}