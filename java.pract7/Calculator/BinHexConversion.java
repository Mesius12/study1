package Calculator;

public class BinHexConverison {
    public static String toBin(int n) {
        return Integer.toBinaryString(n);
    }
    public static String toHex(int n) {
        return Integer.toHexString(n).toUpperCase();
    }
}
