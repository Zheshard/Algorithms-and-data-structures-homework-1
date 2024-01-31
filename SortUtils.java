public class SortUtils {

    /*
     * Сортировка выбором
     */
    public static void directSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int saveIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[saveIndex]) {
                    saveIndex = j;
                }
            }
            if (saveIndex != i) {
                int buf = array[i];
                array[i] = array[saveIndex];
                array[saveIndex] = buf;
            }
        }
    }

    /*
     * Быстрая сортировка
     */
    public static void quickSort(int[] array) {
        if (array == null) {
            return;
        }
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int start, int end) {
        int left = start;
        int right = end;
        int middle = array[(start + end) / 2]; // Значение опорного элемента

        do {
            while (array[left] < middle) {
                left++;
            }

            while (array[right] > middle) {
                right--;
            }

            if (left <= right) {
                if (left < right) {
                    int buf = array[left];
                    array[left] = array[right];
                    array[right] = buf;
                }
                left++;
                right--;
            }
        } while (left <= right);

        if (left < end) {
            quickSort(array, left, end);
        }

        if (start < right) {
            quickSort(array, start, right);
        }
    }

    /*
     * Пирамидальная сортировка
     */

    public static void heapSort(int[] array) {

        // Построение кучи (преобразование массива)
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }

        // Один за другим извлекаем элементы из кучи
        for (int i = array.length - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Вызываем процедуру просеивания на уменьшенной куче
            heapify(array, i, 0);
        }

    }

    private static void heapify(int[] array, int arrSize, int rootIndex) {

        int largest = rootIndex; // инициализируем наибольший элемент как корень
        int leftChild = 2 * rootIndex + 1; // левый потомок
        int rightChild = 2 * rootIndex + 2; // правый потомок

        // Если левый дочерний элемент больше корня
        if (leftChild < arrSize && array[leftChild] > array[largest]) {
            largest = leftChild;
        }
        // Если правый дочерний элемент больше, чем самый большой элемент на данный
        // момент
        if (rightChild < arrSize && array[rightChild] > array[largest]) {
            largest = rightChild;
        }
        // Если самый большой элемент не корень
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;
            heapify(array, arrSize, largest);
        }

    }

}
