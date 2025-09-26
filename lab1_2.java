import java.util.Scanner; // Импортируем класс для считывания ввода пользователя

public class lab1_2 {

    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода из консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя первое число
        System.out.print("Введите первое число (a): ");
        double a = scanner.nextDouble();

        // Запрашиваем у пользователя второе число
        System.out.print("Введите второе число (b): ");
        double b = scanner.nextDouble();

        // 1. Находим наибольшее из двух чисел с помощью метода Math.max()
        double max_val = Math.max(a, b);
        System.out.println("Наибольшее число (max(a,b)): " + max_val);

        // 2. Вычисляем тангенс найденного максимального числа
        // Важно: функция Math.tan() принимает угол в радианах.
        // Если ваши числа a и b представляют градусы, их нужно сначала
        // перевести в радианы с помощью Math.toRadians().
        // В данном случае мы считаем, что числа уже в радианах.
        double d = Math.tan(max_val);

        // 3. Выводим конечный результат
        System.out.println("Результат d = tg(max(a,b)): " + d);
        
        // Закрываем scanner, чтобы избежать утечек ресурсов
        scanner.close();
    }
}