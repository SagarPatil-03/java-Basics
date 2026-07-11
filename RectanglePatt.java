public class RectanglePatt {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {      // 4 rows
            for (int j = 1; j <= 5; j++) {  // 5 columns
                System.out.print("* ");
            }
            System.out.println();           // Move to next line
        }
    }
}