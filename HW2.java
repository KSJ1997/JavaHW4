// 2. Пусть дан LinkedList с несколькими элементами, реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class HW2<T> {
    private LinkedList<T> list = new LinkedList<T>();

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        return list.poll();
    }

    public T first() {
        return list.peek();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        HW2<String> queue = new HW2<String>();

        // добавляем элементы в очередь
        queue.enqueue("Первый");
        queue.enqueue("Второй");
        queue.enqueue("Третий");

        // выводим первый элемент
        System.out.println("Первый элемент: " + queue.first());

        // извлекаем первый элемент и выводим его
        String first = queue.dequeue();
        System.out.println("Извлеченный элемент: " + first);

        // выводим первый элемент после извлечения
        System.out.println("Первый элемент: " + queue.first());

        // проверяем, пуста ли очередь
        System.out.println("Очередь пуста?: " + queue.isEmpty());

        // выводим количество элементов в очереди
        System.out.println("Количество элементов в очереди: " + queue.size());
    }
}
