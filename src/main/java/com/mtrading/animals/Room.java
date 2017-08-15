package com.mtrading.animals;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private List<Cat> catSet = new ArrayList<>();
    private Cupboard cupboard;

    public Room(Cupboard cupboard) {
        this.cupboard = cupboard;
    }

    public void addCat(Cat cat){
        this.catSet.add(cat);
    }
    public void switchHoover(Boolean enabled) throws Exception {
        if (enabled) {
            for (Cat cat : this.catSet) {
                this.hideCat(cat, this.cupboard);
            }
        }
    }

    private void hideCat(Cat cat, Cupboard cupboard) throws Exception {
        Thread.sleep(1000);
        if (cat.getAssSize() < cupboard.getClearance()) {
            System.out.println(
                    String.format(
                            "%s прячется под шкафом",
                            cat.getName()
                    )
            );
        } else {
            throw new Exception(
                    String.format(
                            "%s слишком жирный '%s' для этого шкафа '%s'",
                            cat.getName(),
                            cat.getAssSize(),
                            cupboard.getClearance()
                    )
            );
        }
    }

}
