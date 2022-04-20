package test;

import impl.ArrayListImpl;
import impl.LinkedListImpl;
import list.Queue;
import list.Stack;

public class BridgeTest {
    public static void main(String[] args) {
        Stack<String> linkedStack = new Stack<String>(new LinkedListImpl<String>());
        linkedStack.push("aaa");
        linkedStack.push("bbb");
        linkedStack.push("ccc");

        System.out.println(linkedStack.toString());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println("===================================");

        Stack<String> arrayStack = new Stack<>(new ArrayListImpl<String>());
        arrayStack.push("aaa");
        arrayStack.push("bbb");
        arrayStack.push("ccc");

        System.out.println(arrayStack.toString());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println("===================================");

        Queue<String> arrayQueue = new Queue<String>(new ArrayListImpl<String>());
        arrayQueue.enqueue("aaa");
        arrayQueue.enqueue("bbb");
        arrayQueue.enqueue("ccc");

        System.out.println(arrayQueue.toString());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println("===================================");

        Queue<String> linkedQueue = new Queue<String>(new LinkedListImpl<>());
        linkedQueue.enqueue("aaa");
        linkedQueue.enqueue("bbb");
        linkedQueue.enqueue("ccc");

        System.out.println(linkedQueue.toString());
        System.out.println(linkedQueue.dequeue());
        System.out.println(linkedQueue.dequeue());
        System.out.println(linkedQueue.dequeue());
        System.out.println("===================================");
    }
}
