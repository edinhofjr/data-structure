package dev.edinho.LinkedList;

public class LinkedList {
    private Node head;
    private int size;


    public LinkedList() {}

    public void add(int value) {
        Node newNode = new Node(value);    
        Node aux = head;
    
        if (aux == null) {
            head = newNode;
        } else {
            while (aux.hasNext()) {
                aux = aux.getNext();
            }
            aux.setNext(newNode);
        }
        size++; 
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node aux = head;
            head = newNode;
            newNode.setNext(aux);
        }
    }

    public int getLenght() {
        return size;
    }
}
