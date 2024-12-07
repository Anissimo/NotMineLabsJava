package org.example.lab7;

import org.example.lab7.interfaces.StringComparator;

import java.util.Arrays;
import java.util.function.Predicate;

public class LabRunner7 {
    public static void runLab() {
        // 1. Сравнение строк
        StringComparator comparator = (str1, str2) -> str1.length() > str2.length() ? str1 : str2;
        System.out.println(comparator.compare("hello", "world"));

        // 2. Сортировка массива
        int[] array = {5, 2, 8, 1, 9};
        ArraySorter.sortArray(array);
        System.out.println(Arrays.toString(array));

        // 3. Проверка панграммы
        System.out.println(PangramChecker.isPangram("The quick brown fox jumps over the lazy dog"));

        // 4. Проверка имени
        Predicate<String> predicate = NamePredicate.startsWith('J');
        System.out.println(predicate.test("John"));
    }
}