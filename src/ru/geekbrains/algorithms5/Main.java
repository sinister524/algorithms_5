package ru.geekbrains.algorithms5;

public class Main {

    public static void main(String[] args) {
        System.out.println(Recursion.involution(2, 3));

        Item book = new Item("Book",500, 1);
        Item phone = new Item("Phone",10000, 0.2);
        Item laptop = new Item("Laptop", 50000, 4.3);
        Item camera = new Item("Camera",30000, 3);
        Item wallet = new Item("Wallet",3000, 0.5);
        Item charger = new Item("Charger",500, 0.8);
        Item boots = new Item("Boots",6000, 2.6);

        ArrItems stuff = new ArrItems(7);
        stuff.setElement(0,book);
        stuff.setElement(1,phone);
        stuff.setElement(2,laptop);
        stuff.setElement(3,camera);
        stuff.setElement(4,wallet);
        stuff.setElement(5,charger);
        stuff.setElement(6,boots);

        Bag backpack = new Bag(6);

        stuff.sortInsert();
        for (int i = 0; i < stuff.getSize(); i++) {
            backpack.push(stuff.getElem(i));

        }
        System.out.println("Общая стоимость: " + backpack.getFullCoast());
        while (backpack.getTop()!= -1){
            System.out.println(backpack.pop().getName());
        }
    }
}
