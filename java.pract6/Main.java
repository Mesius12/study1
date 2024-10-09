import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите трехзначное число: ");
            int num = Integer.parseInt(scanner.nextLine());
            String result = WordsTable.WordsForConvertion(num);
            System.out.println(num + " --> " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error! Ввод должен быть целым числом.");
        } catch (OutOfRangeError | WrongNumberFormat e) {
            System.out.println("Error! " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
