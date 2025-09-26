import java.util.Scanner;

/**
 * Программа для вычисления значений функций Y и F в зависимости от введенного x.
 */
public class lab1_3 {

    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем значение x
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        // Объявляем переменные для результатов
        double y;
        double f;

        // Используем составной оператор (if-else if-else) для определения диапазона x
        if (x <= 0) {
            // Ветвь для x <= 0
            System.out.println("Выполняется вычисление для условия: x <= 0");
            y = 1 - Math.pow(x, 5) + Math.tan(8 * x);
            f = Math.exp(2 * x + 1);

        } else if (x <= 3) { // Условие x > 0 здесь подразумевается, т.к. первая проверка не прошла
            // Ветвь для 0 < x <= 3
            System.out.println("Выполняется вычисление для условия: 0 < x <= 3");
            y = 1 + Math.pow(3, x);
            f = Math.pow(x, 2) - Math.sin(4 * x);

        } else { // Сюда попадаем, если x > 3
            // Ветвь для x > 3
            System.out.println("Выполняется вычисление для условия: x > 3");
            y = Math.atan(2 * x + 1);
            f = Math.pow(x, 2.0 / 5.0); // Это эквивалентно корню 5-й степени из x^2
        }

        // Выводим полученные результаты на экран
        System.out.println("\nРезультаты:");
        System.out.println("Y = " + y);
        System.out.println("F = " + f);

        // Закрываем scanner
        scanner.close();
    }
}