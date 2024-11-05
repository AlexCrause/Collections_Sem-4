package org.example.task_3;

import java.util.*;
import java.util.stream.Collectors;

/**
 * В рамках выполнения задачи необходимо:
 * Создайте телефонный справочник с помощью Map - телефон это ключ, а имя значение
 * Найдите человека с самым маленьким номером телефона
 * Найдите номер телефона человека чье имя самое большое в алфавитном порядке
 */
public class Program {

    public static String findByMinPhoneNumber(Map<String, String> phoneBook) {
        Set<Long> numbers = phoneBook.keySet().stream().map(el -> Long.valueOf(el)).collect(Collectors.toSet());
        long number = numbers.stream().min(Comparator.naturalOrder()).get();
        return String.format("Наименьший номер: %s, владелец: %s",
                number, phoneBook.get(String.valueOf(number)));
    }

    public static String findByMaxName(Map<String, String> phoneBook) {

        // 1 вариант
        Set<Map.Entry<String, String>> elements = phoneBook.entrySet();
        // Map.Entry<String, String> name = elements.stream().max(Map.Entry.comparingByValue()).get(); //короткий вариант
        Map.Entry<String, String> name = elements.stream().max((entry1, entry2) -> entry1.getValue().
                compareTo(entry2.getValue())).get();
        return String.format("Наибольшее имя: %s, номер: %s",
                name.getValue(), name.getKey());

          // 2 вариант
//        List<String> names = phoneBook.values().stream().collect(Collectors.toList());
//        String name = names.stream().max(Comparator.naturalOrder()).get();
//        return String.format("Наибольшее имя: %s, владелец: %s",
//                name, phoneBook.entrySet().stream().filter(el -> el.getValue().equals(name)).findFirst().get().getKey());

    }

    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("123456789", "Пётр");
        phoneBook.put("12345678", "Василий");
        phoneBook.put("123456787", "Мария");

        System.out.println(findByMinPhoneNumber(phoneBook));
        System.out.println(findByMaxName(phoneBook));

    }

}
