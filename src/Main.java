import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int[ ] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println();
    }

    public static void task2 () {
        System.out.println("Задча 2");
        int[ ] arr = generateRandomArray();
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
        System.out.println();

        int min = arr[0];
        for (int i =0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составвила " + min + " рублей.");
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int[ ] arrSalary = generateRandomArray();
        System.out.println(Arrays.toString(arrSalary));
        double avgSalary = 0;
        for (int i = 0; i < arrSalary.length; i++) {
            avgSalary += (double) arrSalary[i] / arrSalary.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + avgSalary + " рублей.");
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", avgSalary);
        System.out.println();
    }
}
