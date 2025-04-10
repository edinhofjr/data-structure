package dev.edinho.BinaryTree;

public class Node {
    private int value;
    private Node left = null;
    private Node right = null;

    public Node(int value) {
        this.value = value;
    }

    public boolean hasLeft() {
        return left != null;
    }

    public boolean hasRight() {
        return right != null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
    public void setLeft(int value) {
        this.left = new Node(value);
    }
}
