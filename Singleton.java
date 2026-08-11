class Main {

    private static Main obj;

    private Main() {
    }

    public static Main getInstance() {

        if (obj == null) {
            obj = new Main();
        }

        return obj;
    }
}

class Singleton {
    public static void main(String[] args) {

        Main s1 = Main.getInstance();
        Main s2 = Main.getInstance();

        System.out.println(s1 == s2);

        System.out.println("This is the Basic Example Of SingleTon Method.");
    }
}