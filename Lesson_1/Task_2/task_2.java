package Lesson_1.Task_2;

public class task_2 {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        int i = 0;
        while (i < 1000) {
            numbers[i] = 0 + i;
            i++;
        }
        int num = 0;
        String primeNumbers = "";

        for (i = 1; i <= 1000; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Простые числа от 1 до 1000:");
        System.out.println(primeNumbers);
        System.out.println(numbers[900]);
    }
}
