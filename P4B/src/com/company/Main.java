package com.company;

public class Main {

    public static void main(String[] args) {
        AutoHuur ah1 = new AutoHuur();
        System.out.println("Eerste autohuur:\n" + ah1 + "\n");

        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.0);
        ah1.setHuurder(k);
        System.out.println("Eerste autohuur:\n" + ah1 + "\n");

        Auto a1 = new Auto("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);
        System.out.println("Eerste autohuur:\n" + ah1 + "\n");

        AutoHuur ah2 = new AutoHuur();
        Auto a2 = new Auto("Ferrari", 3500);
        ah2.setGehuurdeAuto(a2);
        ah2.setHuurder(k);
        ah2.setAantalDagen(1);
        System.out.println("Tweede autohuur:\n" + ah2 + "\n");

        System.out.println("Gehuurd: " + ah1.getGehuurdeAuto());
        System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());
    }
}

class AutoHuur{
    private Klant huurder;
    private Auto gehuurdeAuto;
    private int aantalDagen;

    AutoHuur(){

    }

    public void setAantalDagen(int ant){
        aantalDagen = ant;
    }

    public void setHuurder(Klant kl) {
        huurder = kl;
    }

    public void setGehuurdeAuto(Auto au) {
        gehuurdeAuto = au;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public String toString(){
        if (gehuurdeAuto != null && )
    }
}

class Klant{
    private double korting;
    private String naam;

    Klant(String n){
        naam = n;
    }

    public void setKorting(double v) {
        korting = v;
    }

    public double getKorting(){
        return korting;
    }


}

class Auto{
    private String type;
    private Double prijsPerDag;
    Auto(String tp, double prPd){
        type = tp;
        prijsPerDag = prPd;
    }

    public void setPrijsPerDag(double prPd){
        prijsPerDag = prPd;
    }

    public double getPrijsPerDag(){
        return prijsPerDag;
    }
}
