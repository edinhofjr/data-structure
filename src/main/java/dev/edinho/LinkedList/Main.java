package dev.edinho.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(1);
        ll.add(2);
        ll.addFirst(3);
        System.out.println(ll.getLenght());
    }
}