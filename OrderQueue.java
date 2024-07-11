/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa138816.question.pkg5;

/**
 *
 * @author abdir
 */
import java.util.LinkedList;
import java.util.Queue;

public class OrderQueue {
    private Queue<Supply> orderQueue;

    public OrderQueue() {
        orderQueue = new LinkedList<>();
    }

    public void addOrder(Supply supply) {
        orderQueue.add(supply);
    }

    public Supply processOrder() {
        return orderQueue.poll();
    }

    public boolean isEmpty() {
        return orderQueue.isEmpty();
    }

    public void printOrders() {
        for (Supply supply : orderQueue) {
            System.out.println(supply);
        }
    }
}
