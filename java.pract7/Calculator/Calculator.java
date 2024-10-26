package Calculator;

public class Calculator {
    public double ADD(double a, double b) {
        return BasicOperations.ADD(a,b);
    }
    public double SUB(double a, double b) {
        return  BasicOperations.SUB(a,b);
    }
    public double MUL(double a, double b) {
        return BasicOperations.MUL(a,b);
    }
    public double DIV(double a, double b) {
        return BasicOperations.DIV(a,b);
    }
    public double POW(double start, double exp) {
        return Exponent.POW(start,exp);
    }
    public String BIN(int n) {
        return BinHexConverison.toBin(n);
    }
    public  String HEX(int n) {
        return BinHexConverison.toHex(n);
    }
    public double TET(double a, int b) {
        return Tetration.TET(a,b);
    }
}
