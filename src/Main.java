
/*import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int maxSum = 0;
        int maxNumber = 0;

        for (int i = 0; i < 20; i++) {
            int number = random.nextInt(10,99);
            int sumOfDigits = sumDigits(number);

            System.out.println("Число: " + number + ", Сумма цифр: " + sumOfDigits);


            if (sumOfDigits > maxSum) {
                maxSum = sumOfDigits;
                maxNumber = number;
            }
        }

        System.out.println("\nЧисло с максимальной суммой цифр: " + maxNumber + ", Сумма цифр: " + maxSum);
    }

    // Метод для вычисления суммы цифр числа
    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}*/


/*import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int numbers = 0;

        for (int i = 0; i < 50; i++){
            numbers = random.nextInt(-40, 40);

        }

    }
}*/


/*while1

        11:41
import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

// Запуск цикла
        while (true) {
            System.out.print("Введите число (0 для выхода): ");
            number = scanner.nextInt();

// Если введен 0, завершить цикл
            if (number == 0) {
                System.out.println("Вы ввели 0, программа завершена.");
                break;
            }

// Проверка положительное или отрицательное число
            if (number > 0) {
                System.out.println("Положительное");
            } else {
                System.out.println("Отрицательное");
            }
        }

        scanner.close(); // Закрыть сканер после завершения работы программы
    }
}*/

/*
for 2

import java.util.Random;

public class RandomSeries {
    private static final int SERIES_LENGTH = 50;
    private static final int MIN_VALUE = -40;
    private static final int MAX_VALUE = 40;

    public static void main(String[] args) {
        Random random = new Random();
        int[] series = new int[SERIES_LENGTH];

// Генерация случайных чисел
        for (int i = 0; i < SERIES_LENGTH; i++) {
            series[i] = random.nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
        }

// Определение наибольшего и наименьшего значений
        int max = series[0];
        int min = series[0];

        for (int i = 1; i < SERIES_LENGTH; i++) {
            if (series[i] > max) {
                max = series[i];
            }
            if (series[i] < min) {
                min = series[i];
            }
        }

// Вывод результатов
        System.out.println("Сгенерированная серия чисел: ");
        for (int num : series) {
            System.out.print(num + " ");
        }
        System.out.println("\nНаибольшее значение: " + max);
        System.out.println("Наименьшее значение: " + min);
    }
}
*/


/*
Доп задания по циклам и условиям*/

/*Задание 1*/


/*
import java.io.Console;

public class Main {
    public static void main(String[] args) {

        for (int i = 1;i <= 10; i++){
            System.out.println(i);
        }
    }
}*/

/*Задание 2*/

/*import java.io.Console;

public class Main {
    public static void main(String[] args) {
int sum = 0;
        for (int i = 1;i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}*/


/*
Задание 3*/

/*
public class Main {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1;i <= 5; i++){
            sum *= i;
        }
        System.out.println(sum);
    }
}
*/

/*Задание 4*/


/*
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {

                System.out.println(i + " * " + j + " = " + (i * j));
            }

            System.out.println();
    }
}
}*/


/*
Задание 5*/


/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        if (number % 2 == 0){
            System.out.println("Четные числа от 1 до " + number + ": ");
            for (int i = 1; i <= number; i++){
                if (i % 2 == 0) {
                    System.out.println(i);
                }

            }
        }

        else {
            System.out.println("Нечетные числа от 1 до " + number + ":");
            for (int i = 1; i <= number; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
        }

    }
}
}*/

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Создаем экземпляр Scanner для считывания данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Выводим приглашение для ввода трёх положительных чисел
        System.out.println("Введите три положительных числа для проверки, могут ли они быть сторонами треугольника:");

        // Считываем три числа
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Проверяем, могут ли они быть сторонами треугольника
        boolean result = triangle(a, b, c);

        // Выводим результат проверки
        if (result) {
            System.out.println("Числа могут быть сторонами треугольника.");
        } else {
            System.out.println("Числа не могут быть сторонами треугольника.");
        }
    }

    // Метод triangle(), проверяющий, могут ли три числа быть сторонами треугольника
    public static boolean triangle(int a, int b, int c) {
        // Условие неравенства треугольника: сумма любых двух сторон должна быть больше третьей стороны
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}*/

