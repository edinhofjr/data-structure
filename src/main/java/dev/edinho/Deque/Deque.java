package dev.edinho.Deque;

import java.util.NoSuchElementException;

public class Deque {
    private Node head = null;
    private Node tail = null;

    public Deque() {}

    public void insertStart(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node; 
            tail = node;
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
