package com.company;
import java.util.ArrayList;
import java.util.Comparator;



public class Main {

    public static void main(String[] args) {
        ArrayList<Furniture> coolMebel = new  ArrayList<>();
        coolMebel.add(new Furniture("Emperor",500, FurnitureType.Chair, 90, 40,"black" ));
        coolMebel.add(new Furniture("ArturTable" ,1000, FurnitureType.Table, 95, 200,"brown" ));
        coolMebel.add(new Furniture("Greece",1340, FurnitureType.Bed, 90, 200,"gray" ));
        coolMebel.add(new Furniture("BaobabBad",500, FurnitureType.Bed, 90, 40,"red" ));
        coolMebel.sort(
                Comparator.comparing(Furniture::getPrice).thenComparing(Furniture::getName)
        );
        System.out.println(coolMebel.toString());
    }
}
