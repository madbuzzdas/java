import java.util.Scanner;
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);//Сканнер для ввода пользователя.
    System.out.println("Введите пример ");// Вывод текста на экран.
    int a = sc.nextInt();// Обращение к сканеру для ввода целого числа.
    char operation = sc.next().charAt(0);// Обращение к сканеру для ввода символа на экран.
    int b = sc.nextInt();// Обращение к сканеру для ввода целого числа.
    String str1 = Integer.toString(a);// Строка целого числа
    String str2 = Integer.toString(b); // Строка целого числа.
    String str3 = Integer.toString(a + b, a - b); // Строка символа числа.
    String str4 = str1 + str2 + str3; // Строка двух чисел и символа.
    //Если b == 0  то деление на нуль нельзя. // Исключение.
    if (b == 0) {
        System.out.println("На нуль делить нельзя " );
    }
    // Символы операции.
    if (operation == '+') {
        int c = a + b;
        System.out.println(c);
    } else if (operation == '-') {
        int c = a - b;
        System.out.println(c);
    } else if (operation == '*') {
        int c = a * b;
        System.out.println(c);
    } else if (operation == '/') {
        int c = a / b;
        System.out.println(c);
        // Если введен другой символ.
    } else {
        System.out.println("Указанная операция не поддерживается калькулятором");
    }
}