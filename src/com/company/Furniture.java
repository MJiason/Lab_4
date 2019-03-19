package com.company;

public class Furniture {

    private String name = this.name;
    private int price = this.price;
    private FurnitureType type = this.type;
    private int height = this.height;
    private int width = this.width;
    private String color = this.color;

    public Furniture(String name, int price, FurnitureType type, int height, int width, String color) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public FurnitureType getType() {
        return type;
    }

    public void setType(FurnitureType type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                '}'+"\n";
    }
}