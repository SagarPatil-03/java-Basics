import java.util.Arrays;

class AddSorted {

    public static void main(String args[]) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};

        int[] result = new int[arr1.length + arr2.length];
        int index =  0;

        for (int num : arr1) {
            result[index++] = num;
        }

        for (int num : arr2) {
            result[index++] = num;
        }

        System.out.println(Arrays.toString(result))  ;
    }
}