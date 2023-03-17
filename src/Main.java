public class Main {
    public static void main(String[] args) {
    task1();
    task2();
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
}
