package org.example.task_1;

import java.util.*;

/**
 * В рамках выполнения задачи необходимо:
 * Создайте коллекцию мужских и женских имен с помощью интерфейса List
 * Отсортируйте коллекцию в алфавитном порядке
 * Отсортируйте коллекцию по количеству букв в слове
 * Разверните коллекцию
 */
public class Sorting{

    public static void sortByNameAlphabetically(List<String> list) {
        Collections.sort(list);
    }

    public static void numberOfLetters(List<String> list) {
        list.sort(Comparator.comparing(String::length));
    }

    public static void reverse(List<String> list) {
        Collections.reverse(list);
    }

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Василий", "Оля", "Маша", "Александр", "Даша"));

        sortByNameAlphabetically(names);
        System.out.println(names);

        numberOfLetters(names);
        System.out.println(names);

        reverse(names);
        System.out.println(names);
    }
}