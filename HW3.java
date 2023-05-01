// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

import java.util.Iterator;
import java.util.LinkedList;

public class HW3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int sum = 0;
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()) {
            int element = iterator.next();
            sum += element;
        }

        System.out.println("Сумма всех элементов в LinkedList: " + sum);
    }
}
