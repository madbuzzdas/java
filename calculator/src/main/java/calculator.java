import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Введите второе число");
        double b = new Scanner(System.in).nextDouble();

        System.out.println("Введите операцию(+,-,/,*");
        char c = new Scanner(System.in).next().charAt(0);

        switch (c) {
            case '+':
                System.out.println("a+b=" + (a + b));
            break;
            case '-':
                System.out.println("a-b=" + (a - b));
                break;
            case '/':
                System.out.println("a/b=" + (a / b));
                break;
            case '*':
                System.out.println("a*b=" + (a * b));
                break;
                default:
                    System.out.println("Введите правильное действие");
                    break;
        }



    }

}
