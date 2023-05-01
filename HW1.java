// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.

import java.util.LinkedList;

public class HW1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        LinkedList<Integer> reversedList = reverseList(list);

        System.out.println("Исходный список: " + list);
        System.out.println("Перевернутый список: " + reversedList);
    }

    public static <T> LinkedList<T> reverseList(LinkedList<T> list) {
        LinkedList<T> reversedList = new LinkedList<>();
        for (T element : list) {
            reversedList.addFirst(element);
        }
        return reversedList;
    }
}