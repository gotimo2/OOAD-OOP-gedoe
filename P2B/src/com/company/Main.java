package com.company;

public class Main {

    public static void main(String[] args) {
        Voetbalclub ajx = new Voetbalclub("Ajax      ");
        Voetbalclub feij = new Voetbalclub("Feijenoord");

        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');
        System.out.println("Feijenoord punten: " + feij.aantalPunten());
        System.out.println("Ajax gespeeld: " + ajx.aantalGespeeld());
        System.out.println();

        System.out.println(ajx);
        System.out.println(feij);
    }
}

class Voetbalclub {

    private String naam = "FC";
    private int aantalGewonnen = 0;
    private int aantalGelijk = 0;
    private int aantalVerloren = 0;
    private int aantalPunten = 0;
    private int aantalGespeeld = 0;

    public void verwerkResultaat(char ch) {
        if (ch == 'w') {
            aantalGespeeld++;
            aantalGewonnen++;
            aantalPunten = aantalPunten + 3;
            //System.out.println("wedstrijd gewonnen " + aantalPunten);
        }
        if (ch == 'g') {
            aantalPunten++;
            aantalGelijk++;
            aantalGespeeld++;
            //System.out.println("wedstrijd gelijk gespeeld " + aantalPunten);
        }
        if (ch == 'v'){
            aantalVerloren++;
            aantalGespeeld++;
        }
    }

    Voetbalclub(String n){
        this.naam = n;
        if (n = ""){
            this.naam = "FC"
        }
    }


    public String aantalGespeeld() {
        return Integer.toString(aantalGespeeld);
    }

    @Override
    public String toString() {
        return this.naam + " " + this.aantalGespeeld + " " + this.aantalGewonnen + " " + this.aantalGelijk + " " + this.aantalVerloren + " " + this.aantalPunten;
    }

    public String aantalPunten() {
        return Integer.toString(aantalPunten);
    }

}

