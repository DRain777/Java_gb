package lesson4_home_work_4;

import java.util.LinkedList;

// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class les4_task_2<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void enqueue(T item) {
        list.addLast(item);
    }

    public LinkedList getElements() {
        return list;
    }

    public T dequeue() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.removeFirst();
    }

    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.getFirst();
    }

    public static void main(String[] args) {
        les4_task_2<Integer> queue = new les4_task_2<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(5);
        queue.enqueue(25);
        System.out.println("First item: " + queue.first());
        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("First item: " + queue.first());
        System.out.println(queue.getElements());
    }
}
