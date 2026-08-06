import java.util.*;
public class RemoveLastDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.println("Enter Your Number that i remove last digit:-");
        int num =sc.nextInt() ;

        num = num / 10;

        System.out.println("Remove The Last Digit From The Given Number:-"+num);
    }
}
    

