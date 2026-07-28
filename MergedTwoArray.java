import java.util.Arrays;

public class MergedTwoArray {
    public static void main(String args[]) {

        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {4, 5, 6};

        int result[] = new int[arr1.length + arr2.length];

        int index = 0;

        // Copy first array
        for (int num : arr1) {
            result[index++] = num;
        }

        // Copy second array
        for (int num : arr2) {
            result[index++] = num;
        }

        System.out.println(Arrays.toString(result));
    }
}