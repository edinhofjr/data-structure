package dev.edinho.BinaryTree;

public class BTree {
    Node root; 
    
    public void addNode(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
    
            while (true) {
                if (value < current.getValue()) {
                    if (!current.hasLeft()) {
                        current.setLeft(newNode);
                        break;
                    } else {
                        current = current.getLeft();
                    }
                } else {
                    if (!current.hasRight()) {
                        current.setRight(newNode);
                        break;
                    } else {
                        current = current.getRight();
                    }
                }
            }
        }
    }

    public void preorder() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        preorder(root);
    }
    
    private void preorder(Node node) {
        System.out.println(node.getValue());

        if (node.hasLeft()) {
            preorder(node.getLeft());
        }

        if (node.hasRight()) {
            preorder(node.getRight());
        }
    }

    public void inorder() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        inorder(root);
    }

    private void inorder(Node node) {
        if (node.hasLeft()) {
            inorder(node.getLeft());
        }

        System.out.println(node.getValue());

        if (node.hasRight()) {
            inorder(node.getRight());
        }
    }

    public void postorder() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        postorder(root);
    }

    private void postorder(Node node) {
        if (node.hasLeft()) {
            postorder(node.getLeft());
        }

        if (node.hasRight()) {
            postorder(node.getRight());
        }

        System.out.println(node.getValue());
    }
}
