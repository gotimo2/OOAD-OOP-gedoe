package com.company;

public class Main {

    public static void main(String[] args) {
        Huis h1 = new Huis("Nijenoord 1", 1970);
        Persoon p1 = new Persoon("Ronald Plasterk", 52);
        h1.setHuisbaas(p1);
        System.out.println(h1);
        System.out.println();

        Huis h2 = new Huis("Vredenburg", 1991);
        Persoon p2 = new Persoon("Annie Brouwers", 59);
        h2.setHuisbaas(p2);
        System.out.println(h2);
        System.out.println();
        System.out.println("Huisbaas 1: " + h1.getHuisbaas());
        System.out.println("Huisbaas 2: " + h2.getHuisbaas());
    }
}

class Persoon{
    private String naam = "";
    private int leeftijd = 0;

    Persoon(String nm, int lft){
        this.naam = nm;
        this.leeftijd = lft;
    }
    public String toString(){
        return(String.format("%s; leeftijd %s jaar", this.naam, this.leeftijd));
    }
}

class Huis{
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    Huis(String adr, int bwj){
        this.adres = adr;
        this.bouwjaar = bwj;
    }

    public void setHuisbaas(Persoon p){
        this.huisbaas = p;
    }

    public String toString(){

        if(huisbaas != null){
            return(String.format("huis %s is gebouwd in %s \nen heeft huisbaas %s", this.adres, this.bouwjaar, this.huisbaas));
        }
        else{
            return(String.format("huis %s is gebouwd in %s", this.adres, this.bouwjaar));
        }
    }


    public String getHuisbaas() {
        return(this.huisbaas.toString());
    }

}