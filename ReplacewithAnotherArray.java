import java.util.*;

class ReplacewithAnotherArray {
    public static void main(String[] args) {

        int num1[] = {1, 0, 2, 0, 9, 0, 7, 0};
        int num2[] = {4, 5, 6};

        int j = 0;

        for (int i = 0; i < num1.length; i++) {
            if (num1[i] == 0 && j < num2.length) {
                num1[i] = num2[j++];
            }
        }
       System.out.println("This is program we used inside array 1 present zero repplace by another array2 . ");
        System.out.println(Arrays.toString(num1));
    }
}