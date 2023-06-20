package Lesson_1.Task_2;

public class task_2 {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;
        String primeNumbers = "";
        System.out.println(primeNumbers);

        for (i = 1; i <= 1000; i++) {

            int counter = 0;
            // System.out.println(counter);

            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter++;
                    // System.out.println(counter);
                }
            System.out.println(counter);
            
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Простые числа от 1 до 1000:");
        System.out.println(primeNumbers);
    }
}
