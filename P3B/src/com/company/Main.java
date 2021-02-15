package com.company;

public class Main {

    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null;
        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}

class Cirkel {
    private int radius = 0;
    private int xPositie = 0;
    private int yPositie = 0;

    Cirkel (int rad, int x, int y){
        this.radius = rad;
        if (rad <= 0){
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
        this.xPositie = x;
        this.yPositie = y;
    }

    public String toString(){
        return(String.format("cirkel (%s, %s) met radius: %s",this.xPositie, this.yPositie, this.radius));
    }

}