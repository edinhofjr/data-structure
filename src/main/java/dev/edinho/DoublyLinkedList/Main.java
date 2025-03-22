package dev.edinho.DoublyLinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.add(1);
        dll.add(2);
        dll.insertFirst(3);
        dll.insertEnd(0);
        dll.transverseForward();

        System.out.println();

        dll.transverseBackward();
    }
}