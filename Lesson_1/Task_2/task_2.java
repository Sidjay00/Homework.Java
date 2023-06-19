package Lesson_1.Task_2;

public class task_2 {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        int i = 0;
        while (i < 1000) {
            numbers[i] = 0 + i;
            i++;
        }


        System.out.println(numbers[900]);
    }
}
