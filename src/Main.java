
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


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int numbers = 0;

        for (int i = 0; i < 50; i++){
            numbers = random.nextInt(-40, 40);

        }

    }
}



