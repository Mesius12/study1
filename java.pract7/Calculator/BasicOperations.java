package Calculator;

public class BasicOperations {
    public static double ADD(double a, double b) {
        return a + b;
    }
    public static double SUB(double a, double b) {
        return a - b;
    }
    public static double DIV(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя!");
        }
        else {
            return a / b;
        }
    }
    public static double MUL(double a, double b) {
        return a * b;
    }
}
