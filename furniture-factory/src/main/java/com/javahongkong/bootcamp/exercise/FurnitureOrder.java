package com.javahongkong.bootcamp.exercise;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {

    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */

    FurnitureOrder() {
        this.ordersOfFurnitures = new HashMap<>();

    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        ordersOfFurnitures.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        return this.ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        int totalCost = 0;
        for (Map.Entry<Furniture, Integer> entry : this.ordersOfFurnitures
                .entrySet()) {
            totalCost += (entry.getValue() * entry.getKey().cost());
        }
        return totalCost;
    }

    public int getTypeCount(Furniture type) {
        Integer count = ordersOfFurnitures.get(type);
        return count != null ? count : 0;
    }

    public float getTypeCost(Furniture type) {
        Float cost = type.cost() * getTypeCount(type);
        return cost != null ? cost : 0.0f;
    }

    public int getTotalOrderQuantity() {
        int totalQuantity = 0;
        for (Map.Entry<Furniture, Integer> entry : this.ordersOfFurnitures
                .entrySet()) {
            totalQuantity += (entry.getValue());
        }
        return totalQuantity;
    }

}
