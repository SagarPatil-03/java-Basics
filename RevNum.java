public class RevNum {

    public static int Rev(int num) {

        int rev = 0;

        while (num != 0) {
            int digit = num % 10;

            rev = rev * 10 + digit;

            num = num / 10;
        }

        return rev;
    }

    public static void main(String[] args) {

        int result = Rev(234);

        System.out.println(result);
    }
}