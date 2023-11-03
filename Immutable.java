

public final class Immutable1 {
    private final int empId;
    private final String empName;

    Immutable1(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}

class Test {
    public static void main(String[] args) {
        Immutable1 e1 = new Immutable1(10, "Sourav");
        // Accessing values using getter methods
        System.out.println("Employee ID: " + e1.getEmpId());
        System.out.println("Employee Name: " + e1.getEmpName());
    }
}
