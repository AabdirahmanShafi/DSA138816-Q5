/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa138816.question.pkg5;

/**
 *
 * @author abdir
 */
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Supply> supplies;

    public Inventory() {
        supplies = new ArrayList<>();
    }

    public void addSupply(Supply supply) {
        supplies.add(supply);
    }

    public Supply getSupplyById(int id) {
        for (Supply supply : supplies) {
            if (supply.getId() == id) {
                return supply;
            }
        }
        return null;
    }

    public void printInventory() {
        for (Supply supply : supplies) {
            System.out.println(supply);
        }
    }
}
