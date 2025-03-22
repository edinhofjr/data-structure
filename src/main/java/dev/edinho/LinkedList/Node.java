package dev.edinho.LinkedList;

public class Node {
    private int value;
    private Node next = null; 

    public Node(int value) {
        this.value = value;
    }

    public Node() {
    }

    public int getValue() {
        return value;
    }

    public boolean hasNext() {
        return next != null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        this.next = node; 
    }
}
