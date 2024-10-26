package Calculator;

public class Tetration {
    public static double TET(double a, int b) {
        if (a < 1 || b < 1) {
            throw new IllegalArgumentException("значения степени или числа должны быть больше 1");
        }
        double result = 1;
        for (int i = 0; i < b; i++) {
            result = Math.pow(a, result);
        }
        return result;
    }
}
