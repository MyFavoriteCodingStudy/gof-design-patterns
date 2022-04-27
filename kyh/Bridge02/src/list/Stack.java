package list;

import impl.AbstractList;

public class Stack<T> extends List<T> {
    public Stack(AbstractList<T> list) {
        super(list);
        System.out.println("Stack 을 구현");
    }

    public void push(T obj) {
        impl.insertElement(obj, 0);
    }

    public T pop() {
        return impl.deleteElement(0);
    }

    @Override
    public String toString() {
        return impl.toString();
    }
}
