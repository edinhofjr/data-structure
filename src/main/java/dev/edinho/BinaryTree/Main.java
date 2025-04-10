package dev.edinho.BinaryTree;

public class Main {
    public static void main(String[] args) {

        BTree bTree = new BTree();

        bTree.addNode(10);
        bTree.addNode(1);
        bTree.addNode(11);
        bTree.preorder();
        System.out.println();
        bTree.inorder();
    }
}
