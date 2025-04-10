package dev.edinho.Deque;

public class Deque {
    private Node head = null;
    public Deque() {}

    public void insertStart(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
        } else {
            Node aux = head;
            head = node;
            node.setNext(aux);
            aux.setPrev(node);
        }
    }

    public void insertEnd(int value) {

    }
}
