class Calculator {
    void add(int a, int b) {
        System.out.println("Add: " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Subtract: " + (a - b));
    }
}

class AdvancedCalculator extends Calculator {
    void multiply(int a, int b) {
        System.out.println("Multiply: " + (a * b));
    }

    void divide(int a, int b) {
        System.out.println("Divide: " + (a / b));
    }
}

class Q3 {
    public static void main(String[] args) {
        AdvancedCalculator a = new AdvancedCalculator();

        a.add(10, 5);
        a.subtract(10, 5);
        a.multiply(10, 5);
        a.divide(10, 5);
    }
}