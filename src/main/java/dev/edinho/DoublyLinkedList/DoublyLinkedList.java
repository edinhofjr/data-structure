package dev.edinho.DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    private int size;

    public void add(int value) {
        Node newNode = new Node(value);

        if (tail == null) {
            tail = newNode;
            head = tail;
        } else {
            Node aux = tail;
            tail = newNode;
            tail.setPrev(aux);
            aux.setNext(tail);
        }
        size++;
    }

    public void transverseForward() throws Exception {
        if (head == null) {
            throw new Exception("No Elements in DLL to show");
        }

        Node aux = head; 

        while (aux != null) {
            System.out.println(aux.getValue());
            aux = aux.getNext();
        }
    }

    public void transverseBackward() throws Exception {
        if (tail == null) {
            throw new Exception("No Elements in DDL to show");
        }

        Node aux = tail;

        while (aux != null) {
            System.out.println(aux.getValue());
            aux = aux.getPrev();
        }
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node aux = head;
            head = newNode;
            head.setNext(aux);
            aux.setPrev(head);
        }
        size++;
    }

    public void insertEnd(int value) {
        Node newNode = new Node(value);

        if (tail == null) {
            tail = newNode;
            head = tail;
        } else {
            Node aux = tail;
            tail = newNode; 
            newNode.setPrev(aux);
            aux.setNext(newNode);
        }
        size++;
    }

    public Node remove(int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("IndexOutOfBound");
        }
        return null;
    }
}
