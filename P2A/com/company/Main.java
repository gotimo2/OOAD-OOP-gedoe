package com.company;


public class Main {
    public static void main(String[] arg) {
        com.company.Zwembad z1 = new com.company.Zwembad(2.0, 5.5, 1.5);
        System.out.println("BREEDTE: " + z1.getBreedte());
        System.out.println("LENGTE: " + z1.getLengte());
        System.out.println("DIEPTE: " + z1.getDiepte());
        System.out.println("BEREKENDE INHOUD: " + z1.inhoud());
        System.out.println();

        com.company.Zwembad z2 = new com.company.Zwembad( );
        z2.setBreedte(2.5);
        z2.setLengte(100.0);
        z2.setDiepte(2.0);
        double inh = z2.inhoud();
        System.out.println("GEGEVENS ZWEMBAD: "+z2.toString());
        System.out.println("BEREKENDE INHOUD: " + z2.inhoud());
    }
}

class Zwembad{
    private double lengte = 0;
    private double breedte = 0;
    private double diepte = 0;

    public Zwembad( double l, double b, double d){
        lengte = l;
        breedte = b;
        diepte = d;
    }

    public Zwembad() {}


    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getBreedte() {
        return breedte;
    }

    public double getDiepte() {
        return diepte;
    }

    public double inhoud() {
        return lengte * breedte * diepte;
    }

    @Override
    public String toString() {
        return "Dit zwembad is "+ this.getBreedte() + " meter breed, " + this.getLengte() + " meter lang, en " + this.getDiepte() + " meter diep";
    }
}