class Number {
    static void printInfo() {
        System.out.println("This is a Number");
    }
}

class Integer extends Number {
    static void printInfo() {
        System.out.println("This is an Integer");
    }
}

class Double extends Number {
    static void printInfo() {
        System.out.println("This is a Double");
    }
}

public class Main {
    public static void main(String[] args) {
        Number.printInfo();     // Output: "This is a Number"

        Number integerAsNumber = new Integer();
        integerAsNumber.printInfo(); // Output: "This ais a Number" (method hiding)

        Number doubleAsNumber = new Double();
        doubleAsNumber.printInfo();  // Output: "This is a Number" (method hiding)

        Integer.printInfo();    // Output: "This is an Integer"
        Double.printInfo();     // Output: "This is a Double"

        Integer integer = new Integer();
        integer.printInfo();    // Output: "This is an Integer"
        
        Double doubleNum = new Double();
        doubleNum.printInfo();  // Output: "This is a Double"
    }
}
