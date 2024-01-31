import java.util.Random;

public class ArrayUtils {
    private static Random random = new Random();

    /*
     * Подготовить массив целых чисел
     */
    public static int[] prepareArray() {
        return prepareArray(random.nextInt(10, 15));
    }

    /*
     * Подготовить массив целых чисел
     */
    public static int[] prepareArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-99, 100);
        }
        return arr;
    }

    /*
     * Распечатать массив в консоль
     */
    public static void ptintArray(int[] array) {
        for (int element : array) {
            System.out.printf("%d\t", element);
        }
        System.out.println();
    }

}
