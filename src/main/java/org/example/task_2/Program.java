package org.example.task_2;

import java.util.*;

/**
 * В рамках выполнения задачи необходимо:
 * Создайте коллекцию мужских и женских имен с помощью интерфейса List - добавьте повторяющиеся значения
 * Получите уникальный список Set на основании List
 * Определите наименьший элемент (алфавитный порядок)
 * Определите наибольший элемент (по количеству букв в слове но в обратном порядке)
 * Удалите все элементы содержащие букву ‘A’
 */
public class Program{

    public static Set<String> convertListToSet(List<String> strings){
        return new HashSet<>(strings);
    }

    public static String getSmallestElement(Set<String> strings){
        //return Collections.min(strings); // наименьшее по алфавиту имя
        return strings.stream().min(Comparator.naturalOrder()).orElse(null); // наименьшее по алфавиту имя
    }

    public static List<String> minAndMaxLengthNames(Set<String> strings){
        List<String> result = new ArrayList<>();
        //result.add(strings.stream().min(Comparator.comparing(String::length)).orElse(null));
        result.add(strings.stream().min((el1, el2) -> el1.length() - el2.length()).orElse(null));
        result.add(strings.stream().max(Comparator.comparing(String::length)).orElse(null));
        return result;
    }

    public static void removeNamesWithLetter(Set<String> strings, char letter){
        strings.removeIf(s -> s.contains(String.valueOf(letter).toLowerCase()));
    }


    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Василий", "Оля", "Даша", "Александр", "Даша"));
        Set<String> setNames = convertListToSet(names);

        System.out.println(setNames);
        System.out.println(getSmallestElement(setNames));

        System.out.println(minAndMaxLengthNames(setNames));


        removeNamesWithLetter(setNames, 'А');
        System.out.println(setNames);

    }
}
