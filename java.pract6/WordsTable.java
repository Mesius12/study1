
import java.util.Scanner;


class OutOfRangeError extends Exception {
    public OutOfRangeError(String message) {
        super(message);
    }
}

class WrongNumberFormat extends Exception {
    public WrongNumberFormat(String message) {
        super(message);
    }
}


public class WordsTable {
    public static String WordsForConvertion(int n) throws WrongNumberFormat, OutOfRangeError {

        if (n < 100 || n > 999) {
            throw new OutOfRangeError("OutOfRangeError " + " Введенное число не соответствует диапазону");
        }

        // Словари для значений
        String[] single = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] odinnatsatpodevyatn = {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
                "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        String[] desyatki = {"", "", "двадцать", "тридцать", "сорок", "пятьдесят",
                "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] sotni = {"", "сто", "двести", "триста", "четыреста",
                "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};


        // Деление числа для его распределения

        int k = n / 100;
        int a = (n % 100) / 10;
        int b = n%10;


        StringBuilder words = new StringBuilder(sotni[k]);

        if (a == 1) {
            words.append(" ").append(odinnatsatpodevyatn[b]);
        } else {
            words.append(" ").append(desyatki[a]);
            words.append(" ").append(single[b]);
        }
        return words.toString().trim();
    }
}
