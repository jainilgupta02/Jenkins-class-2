class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Main {
    class static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Jay";
        s1.age = 21;

        s1.display();
    }
}
