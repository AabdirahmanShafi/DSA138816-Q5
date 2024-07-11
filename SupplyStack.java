/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa138816.question.pkg5;

/**
 *
 * @author abdir
 */
import java.util.Stack;

public class SupplyStack {
    private Stack<Supply> supplyStack;

    public SupplyStack() {
        supplyStack = new Stack<>();
    }

    public void addSupply(Supply supply) {
        supplyStack.push(supply);
    }

    public Supply retrieveSupply() {
        return supplyStack.pop();
    }

    public boolean isEmpty() {
        return supplyStack.isEmpty();
    }

    public void printStack() {
        for (Supply supply : supplyStack) {
            System.out.println(supply);
        }
    }
}
