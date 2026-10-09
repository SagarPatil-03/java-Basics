
class LastWord {
    public static void main(String args[]) {

        String s = "sagar Patil";
        String[] s1 = s.trim().split("\\s+");

        String lastWord = s1[s1.length - 1];

        System.out.println(lastWord);
        System.out.println(lastWord.length());
    }
}