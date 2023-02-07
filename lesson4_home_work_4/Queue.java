package lesson4_home_work_4;


//2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class Queue {
    private LinkedList elements = new LinkedList();

    public Queue() {
    }

    public Queue(LinkedList elements) {
        this.elements = elements;
    }

    public void enqueue(Object element) {
        elements.add(element);
    }

    public Object dequeue() {
        Object first = elements.getFirst();
        elements.removeFirst();
        return first;
    }

    public Object first() {
        return elements.getFirst();
    }

    public LinkedList getElements() {
        return elements;
    }

    public void setElements(LinkedList elements) {
        this.elements = elements;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(7);
        queue.enqueue(10);
        queue.enqueue(77);
        queue.enqueue(5);
        queue.enqueue(88);
        System.out.println(queue.getElements());
        //queue.dequeue();
        //queue.dequeue();
        //System.out.println(queue.getElements());
        //System.out.println(queue.first());
    }
}
