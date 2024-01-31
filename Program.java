public class Program {

    public static void main(String[] args) {

        int[] array = ArrayUtils.prepareArray();
        // ArrayUtils.ptintArray(array);
        // SortUtils.directSort(array);
        // ArrayUtils.ptintArray(array);

        // System.out.println();

        // array = ArrayUtils.prepareArray();
        // ArrayUtils.ptintArray(array);
        // SortUtils.quickSort(array);
        // ArrayUtils.ptintArray(array);

        // array = ArrayUtils.prepareArray(200000);

        // long startTime = System.currentTimeMillis();
        // SortUtils.directSort(array.clone());
        // long endtTime = System.currentTimeMillis();
        // System.out.printf("Время работы сортировки выбором: %d мс.\n", endtTime -
        // startTime);

        // startTime = System.currentTimeMillis();
        // Arrays.sort(array.clone());
        // endtTime = System.currentTimeMillis();
        // System.out.printf("Время работы системной сортировки: %d мс.\n", endtTime -
        // startTime);

        // startTime = System.currentTimeMillis();
        // SortUtils.quickSort(array.clone());
        // endtTime = System.currentTimeMillis();
        // System.out.printf("Время работы быстрой сортировки: %d мс.\n", endtTime -
        // startTime);

        array = ArrayUtils.prepareArray(100000);
        // ArrayUtils.ptintArray(array);
        long startTime = System.currentTimeMillis();
        SortUtils.heapSort(array);
        long endtTime = System.currentTimeMillis();
        // ArrayUtils.ptintArray(array);
        System.out.printf("Время работы пирамидальной сортировки: %d мс.\n", endtTime - startTime);

        // System.out.println();
        // startTime = System.currentTimeMillis();
        // SortUtils.heapSort(array.clone());
        // endtTime = System.currentTimeMillis();
        // System.out.printf("Время работы пирамидальной сортировки: %d мс.\n", endtTime
        // - startTime);

    }
}
