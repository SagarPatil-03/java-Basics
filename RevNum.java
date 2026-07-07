import java.util.*;
public class RevNum {
    public static void main(String[] args) {
        int num=345;

        String rev= new StringBuffer(String.valueOf(num)).reverse().toString();

        System.out.println(rev);
    }

}
