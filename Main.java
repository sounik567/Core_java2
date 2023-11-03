class Student {
    String name;
    int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    static void teaching() {
        int studentId = 420;
        System.out.println("Inside the teaching static method:");
        System.out.println("Local studentId: " + studentId);
    }

    void bengalore() {
        int studentId = 420;
        System.out.println("Inside the bengalore method:");
        System.out.println("Local studentId: " + studentId);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Beasent", 420);

        Student.teaching();  // Calling the static method teaching()

        student.bengalore(); // Calling the method bengalore()
    }
}
