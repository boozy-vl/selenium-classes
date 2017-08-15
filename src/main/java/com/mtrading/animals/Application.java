package com.mtrading.animals;

public class Application {

    public static void main(String[] args) throws Exception{
        Cupboard cupboard = new Cupboard(15);
        Room room = new Room(cupboard);

        room.addCat(new Cat("Муся", 15));
        room.addCat(new Cat("Барсик", 5));
        room.addCat(new Cat("Василий Петрович", 25));

        room.switchHoover(true);
    }

}
