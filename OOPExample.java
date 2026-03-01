class Student {
    String name;
    int age;
    string study;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("education: " + study);
    }
}

public class OOPExample {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Jay";
        s1.age = 21;
        s1.study = "B.Tech";
        s1.display();
    }
}
