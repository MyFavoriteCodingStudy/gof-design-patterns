package list;

import impl.AbstractList;

public class Queue<T> extends List<T> {
    public Queue(AbstractList<T> list) {
        super(list);
        System.out.println("Queue 를 구현");
    }

    public void enqueue(T obj) {
        impl.addElement(obj);
    }

    public T dequeue() {
        return impl.deleteElement(0);
    }

    @Override
    public String toString() {
        return impl.toString();
    }
}
