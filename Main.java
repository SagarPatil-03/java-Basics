class Student {

    private String name;
    private int age;

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Sagar");
        s.setAge(23);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}