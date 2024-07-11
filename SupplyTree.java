/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa138816.question.pkg5;

/**
 *
 * @author abdir
 */
public class SupplyTree {
    private class Node {
        Supply supply;
        Node left, right;

        public Node(Supply supply) {
            this.supply = supply;
            left = right = null;
        }
    }

    private Node root;

    public SupplyTree() {
        root = null;
    }

    public void addSupply(Supply supply) {
        root = addRecursive(root, supply);
    }

    private Node addRecursive(Node node, Supply supply) {
        if (node == null) {
            return new Node(supply);
        }

        if (supply.getId() < node.supply.getId()) {
            node.left = addRecursive(node.left, supply);
        } else if (supply.getId() > node.supply.getId()) {
            node.right = addRecursive(node.right, supply);
        }

        return node;
    }

    public Supply searchSupply(int id) {
        return searchRecursive(root, id);
    }

    private Supply searchRecursive(Node node, int id) {
        if (node == null || node.supply.getId() == id) {
            return node != null ? node.supply : null;
        }

        if (id < node.supply.getId()) {
            return searchRecursive(node.left, id);
        } else {
            return searchRecursive(node.right, id);
        }
    }

    public void printTree() {
        printInOrder(root);
    }

    private void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.println(node.supply);
            printInOrder(node.right);
        }
    }
}
