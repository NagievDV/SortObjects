public class SortComparableObjects {
    public static <T extends Comparable<T>> void Sort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                // Если элемент j больше следующего
                if (array[j].compareTo(array[j + 1]) > 0) {
                    //Меняем их местами
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}