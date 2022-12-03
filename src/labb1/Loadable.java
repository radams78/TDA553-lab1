package labb1;

import java.util.ArrayList;

public class Loadable {
    private int max_amount;
    private double x;
    private double y;
    private ArrayList<Movable> loaded;

    public Loadable(int max_amount, double x, double y) {
        this.x = x;
        this.y = y;
        this.max_amount = max_amount;
        this.loaded = new ArrayList<Movable>();
    }

    public void load(Movable item) {
        double deltaX = item.getX() - this.x;
        double deltaY = item.getY() - this.y;
        if (Helpers.inBounds(1, -1, deltaX) == 0 && Helpers.inBounds(1, -1, deltaY) == 0) {
            addItemInList(item);
        } else {
            throw new IllegalArgumentException("too far away from the loadable");
        }
    }

    private void addItemInList(Movable item) {
        if (loaded.size() < max_amount) {
            loaded.add(item);
            System.out.println("added item");
        } else {
            throw new IllegalStateException("Loadable is full");
        }
    }

    public Movable unload(Movable item) {
        if (loaded.contains(item)) {
            loaded.remove(item);
            return item;
        }else{
            throw new IllegalStateException("Item not loaded");
        }  
    }
}
