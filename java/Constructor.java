class Student {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student student = new Student("Asim", 08);

        student.displayDetails();
    }
}