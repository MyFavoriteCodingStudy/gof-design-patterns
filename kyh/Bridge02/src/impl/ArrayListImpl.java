package impl;

import java.util.ArrayList;

public class ArrayListImpl<T> implements AbstractList<T> {
    private ArrayList<T> arrayList;

    public ArrayListImpl() {
        arrayList = new ArrayList<T>();
        System.out.println("ArrayList 로 구현");
    }

    @Override
    public void addElement(T obj) {
        arrayList.add(obj);
    }

    @Override
    public T deleteElement(int i) {
        return arrayList.remove(i);
    }

    @Override
    public int insertElement(T obj, int i) {
        arrayList.add(i, obj);
        return i;
    }

    @Override
    public T getElement(int i) {
        return arrayList.get(i);
    }

    @Override
    public int getElementSize() {
        return arrayList.size();
    }

    @Override
    public String toString() {
        return arrayList.toString();
    }
}
