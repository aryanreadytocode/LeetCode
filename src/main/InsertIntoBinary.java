package main;

import org.w3c.dom.Node;
/*You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.

Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.



Example 1:


Input: root = [4,2,7,1,3], val = 5
Output: [4,2,7,1,3,5]
*/
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
