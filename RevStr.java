
class RevStr {
    public static void main(String[] args) {
        String name = "sagar";
        String rev = new StringBuilder(name).reverse().toString();

        System.out.println(rev);
    }
}