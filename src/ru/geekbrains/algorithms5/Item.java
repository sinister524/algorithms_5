package ru.geekbrains.algorithms5;

public class Item {
    private double price;
    private double weight;
    private double ratio;
    private String name;

    public Item(String name,double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.ratio = price / weight;
    }



    public double getPrice() {
        return price;
    }
    public double getWeight() {
        return weight;
    }
    public double getRatio() { return ratio; }
    public String getName() { return name; }
}
