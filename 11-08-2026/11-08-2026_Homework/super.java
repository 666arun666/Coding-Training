class Person {
    String name = "John";
    int age = 20;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo = 101;

    void displayStudent() {
        super.display();
        System.out.println("Roll No: " + rollNo);
    }
}

class Q8 {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayStudent();
    }
}