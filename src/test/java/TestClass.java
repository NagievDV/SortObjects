import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestClass {

    @Test
    public void testSortIntegers() {
        Integer[] input = {5, 2, 8, 4, 1};
        Integer[] expected = {1, 2, 4, 5, 8};
        SortComparableObjects.Sort(input);
        assertArrayEquals(expected, input, "Массив целых чисел не отсортирован корректно");
    }

    @Test
    public void testSortDoubles() {
        Double[] input = {2.2, 3.3, 1.1, 4.4, 0.0};
        Double[] expected = {0.0, 1.1, 2.2, 3.3, 4.4};
        SortComparableObjects.Sort(input);
        assertArrayEquals(expected, input, "Массив double не отсортирован корректно");
    }

    @Test
    public void testSortCharacters() {
        Character[] input = {'и', 'п', 'а', 'г'};
        Character[] expected = {'а', 'г', 'и', 'п'};
        SortComparableObjects.Sort(input);
        assertArrayEquals(expected, input, "Массив символов не отсортирован корректно");
    }

    @Test
    public void testSortStrings() {
        String[] input = {"банан", "яблоко", "апельсин", "киви"};
        String[] expected = {"апельсин", "банан", "киви", "яблоко"};
        SortComparableObjects.Sort(input);
        assertArrayEquals(expected, input, "Массив строк не отсортирован корректно");
    }

    @Test
    public void testSortEmptyArray() {
        Integer[] input = {};
        Integer[] expected = {};
        SortComparableObjects.Sort(input);
        assertArrayEquals(expected, input, "Пустой массив должен оставаться пустым");
    }

    @Test
    public void testSortSingleElementArray() {
        Integer[] input = {42};
        Integer[] expected = {42};
        SortComparableObjects.Sort(input);
        assertArrayEquals(expected, input, "Массив из одного элемента должен оставаться неизменным");
    }

    // Тест на массив, где все элементы одинаковые
    @Test
    public void testSortSameElements() {
        Integer[] input = {1, 1, 1, 1, 1};
        Integer[] expected = {1, 1, 1, 1, 1};
        SortComparableObjects.Sort(input);
        assertArrayEquals(expected, input, "Массив с одинаковыми элементами должен оставаться неизменным");
    }
}