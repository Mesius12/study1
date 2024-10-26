import Calculator.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        while(true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Вовзедение в степень");
            System.out.println("6. Перевод значения в д.с.с.");
            System.out.println("7. Перевод значения в ш.с.с.");
            System.out.println("8. Тетрация");
            System.out.println("0. Выход");

            int UserChoice = scanner.nextInt();

            if (UserChoice == 0) {
                break;
            }
            switch (UserChoice) {
                case 1:
                    System.out.println("Введите первое значение");
                    double add1 = scanner.nextDouble();
                    System.out.println("Введите второе значение");
                    double add2 = scanner.nextDouble();
                    System.out.println("Результат сложения = " + calc.ADD(add1,add2));
                    break;
                case 2:
                    System.out.println("Введите первое значение");
                    double sub1 = scanner.nextDouble();
                    System.out.println("Введите второе значение");
                    double sub2 = scanner.nextDouble();
                    System.out.println("Результат вычитания = " + calc.SUB(sub1,sub2));
                    break;
                case 3:
                    System.out.println("Введите первое значение");
                    double mul1 = scanner.nextDouble();
                    System.out.println("Введите второе значение");
                    double mul2 = scanner.nextDouble();
                    System.out.println("Результат умножения = " + calc.MUL(mul1,mul2));
                    break;
                case 4:
                    System.out.println("Введите первое значение");
                    double div1 = scanner.nextDouble();
                    System.out.println("Введите второе значение");
                    double div2 = scanner.nextDouble();
                    try {
                        System.out.println("Результат: " + calc.DIV(div1, div2));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Введите первое значение");
                    double pow1 = scanner.nextDouble();
                    System.out.println("Введите второе значение");
                    double pow2 = scanner.nextDouble();
                    System.out.println("Результат возведения = " + calc.POW(pow1,pow2));
                    break;
                case 6:
                    System.out.print("Введите число для перевода в двоичную систему: ");
                    int BIN = scanner.nextInt();
                    System.out.println("Результат: " + calc.BIN(BIN));
                    break;
                case 7:
                    System.out.print("Введите число для перевода в шестнадцатеричную систему: ");
                    int HEX = scanner.nextInt();
                    System.out.println("Результат: " + calc.HEX(HEX));
                    break;
                case 8:
                    System.out.print("Введите основание для тетрации: ");
                    double a = scanner.nextDouble();
                    System.out.print("Введите степень для тетрации: ");
                    int b = scanner.nextInt();
                    try {
                        System.out.println("Результат: " + calc.TET(a, b));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Ошибка ввода");
            }
        }
        scanner.close();
    }
}
