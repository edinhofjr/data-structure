package dev.edinho.DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    private int size;

    public void add(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            Node aux = head;

            while (aux.hasNext()) {
                aux = aux.getNext();
            }

            aux.setNext(newNode);
            newNode.setPrev(aux);
            tail = newNode;
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
            newNode.setNext(aux);
            aux.setPrev(newNode);
        }
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
    }
}
