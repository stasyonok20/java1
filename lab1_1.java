public class Calculation {

    public static void main(String[] args) {
        // Проверяем, что было передано ровно два аргумента
        if (args.length != 2) {
            System.out.println("Необходимо ввести два числовых аргумента: x и y");
            return;
        }

        try {
            // Преобразуем аргументы из строкового типа в числовой (double)
            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);

            // Вычисляем произведение чисел
            double product = x * y;

            // Проверяем, больше ли произведение 50
            if (product > 50) {
                // Вычисляем удвоенный квадратный корень из первого числа
                double result = 2 * Math.sqrt(x);
                // Выводим результат на экран
                System.out.println("Результат: " + result);
            }

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: оба аргумента должны быть числами.");
        }
    }
}
