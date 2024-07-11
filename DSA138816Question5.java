/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa138816.question.pkg5;

/**
 *
 * @author abdir
 */
public class DSA138816Question5 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        OrderQueue orderQueue = new OrderQueue();
        SupplyStack supplyStack = new SupplyStack();
        SupplyTree supplyTree = new SupplyTree();

        // Adding supplies to inventory
        Supply supply1 = new Supply(1, "Gauze", 100);
        Supply supply2 = new Supply(2, "Bandage", 50);
        Supply supply3 = new Supply(3, "Syringe", 200);

        inventory.addSupply(supply1);
        inventory.addSupply(supply2);
        inventory.addSupply(supply3);

        // Print inventory
        System.out.println("Inventory:");
        inventory.printInventory();

        // Adding supplies to order queue
        orderQueue.addOrder(supply1);
        orderQueue.addOrder(supply2);

        // Print order queue
        System.out.println("\nOrder Queue:");
        orderQueue.printOrders();

        // Process an order
        Supply processedOrder = orderQueue.processOrder();
        System.out.println("\nProcessed Order: " + processedOrder);

        // Adding supplies to stack
        supplyStack.addSupply(supply3);
        supplyStack.addSupply(supply2);

        // Print stack
        System.out.println("\nSupply Stack:");
        supplyStack.printStack();

        // Retrieve supply from stack
        Supply retrievedSupply = supplyStack.retrieveSupply();
        System.out.println("\nRetrieved Supply: " + retrievedSupply);

        // Adding supplies to tree
        supplyTree.addSupply(supply1);
        supplyTree.addSupply(supply2);
        supplyTree.addSupply(supply3);

        // Print tree
        System.out.println("\nSupply Tree:");
        supplyTree.printTree();

        // Search supply in tree
        Supply searchedSupply = supplyTree.searchSupply(2);
        System.out.println("\nSearched Supply: " + searchedSupply);
    }
}

