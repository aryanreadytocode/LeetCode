package main;

import org.w3c.dom.Node;

public class InsertIntoBinary {

    public static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }


    private Node createNode(int value) {
        return new Node(value);
    }

    public Node insertIntoNode(Node node, int value) {
        if (node == null)
            return createNode(value);

        if (value < node.value)
            node.left = insertIntoNode(node.left, value);
        else if (value > node.value)
            node.right = insertIntoNode(node.right, value);
        return node;
    }
}
