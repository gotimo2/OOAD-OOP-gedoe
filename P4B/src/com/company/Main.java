package com.company;

public class Main {

    public static void main(String[] args) {
        com.company.AutoHuur ah1 = new com.company.AutoHuur();
        System.out.println("Eerste autohuur:\n" + ah1 + "\n");

        com.company.Klant k = new com.company.Klant("Mijnheer de Vries");
        k.setKorting(10.0);
        ah1.setHuurder(k);
        System.out.println("Eerste autohuur:\n" + ah1 + "\n");

        com.company.Auto a1 = new com.company.Auto("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);
        System.out.println("Eerste autohuur:\n" + ah1 + "\n");

        com.company.AutoHuur ah2 = new com.company.AutoHuur();
        com.company.Auto a2 = new com.company.Auto("Ferrari", 3500);
        ah2.setGehuurdeAuto(a2);
        ah2.setHuurder(k);
        ah2.setAantalDagen(1);
        System.out.println("Tweede autohuur:\n" + ah2 + "\n");

        System.out.println("Gehuurd: " + ah1.getGehuurdeAuto());
        System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());
    }
}

class AutoHuur{
    private com.company.Klant huurder;
    private com.company.Auto gehuurdeAuto;
    private int aantalDagen;

    AutoHuur(){

    }

    public void setAantalDagen(int ant){
        aantalDagen = ant;
    }

    public void setHuurder(com.company.Klant kl) {
        huurder = kl;
    }

    public void setGehuurdeAuto(com.company.Auto au) {
        gehuurdeAuto = au;
    }

    public com.company.Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public String toString(){

        String outputString = "";

        if (gehuurdeAuto != null ){
            outputString += "autotype:" + gehuurdeAuto.toString() + "\n";
        }

        if (gehuurdeAuto == null){
            outputString += "er is geen auto bekend \n";
        }

        if (huurder != null){
            outputString += "Op naam van:" + huurder.toString() + "\n";
        }

        if (huurder == null){
            outputString += "er is geen huurder bekend \n";
        }

        if (huurder != null && gehuurdeAuto != null) {
            outputString += String.format("Aantal dagen: %s en dat kost %s ",
                    this.aantalDagen,
                    this.gehuurdeAuto.getPrijsPerDag() * this.aantalDagen * (1 - (this.huurder.getKorting() / 100)));
        }

        if (aantalDagen == 0 ){
            outputString += "Aantal dagen: 0 en dat kost 0.0";
        }




        return(outputString);

    }
}

class Klant{
    private double korting;
    public String naam;

    Klant(String n){
        naam = n;
    }

    public void setKorting(double v) {
        korting = v;
    }

    public double getKorting(){
        return korting;
    }

    public String toString(){
        return(String.format("%s (korting %s)", this.naam, this.korting));
    }

}

class Auto{
    public String type;
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

    public String toString(){
        return(String.format("%s met prijs per dag: %s", this.type, this.prijsPerDag));
    }
}
