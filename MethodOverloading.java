public class MethodOverloading {

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
     System.out.println("Example");
        add(10, 20);        // 30
        add(10, 20, 30);    // 60
    }
}
    

