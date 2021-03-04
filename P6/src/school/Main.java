package school;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int releaseJaar1 = LocalDate.now().getYear() - 1; // 1 jaar geleden

        Game g1 = new Game("Just Cause 3", releaseJaar1, 49.98);
        Game g2 = new Game("Need for Speed: Rivals", releaseJaar1, 45.99);
        Game g3 = new Game("Need for Speed: Rivals", releaseJaar1, 45.99);

        Persoon p1 = new Persoon("Eric", 200);
        Persoon p2 = new Persoon("Hans", 55);

        System.out.println("p1 koopt g1:" + (p1.koop(g1) ? "" : " niet") + " gelukt");
        System.out.println("p1 koopt g2:" + (p1.koop(g2) ? "" : " niet") + " gelukt");
        System.out.println("p1 koopt g3:" + (p1.koop(g3) ? "" : " niet") + " gelukt");
        System.out.println("\np1: " +p1+ "\n\np2: " +p2+ "\n");

        System.out.println("p1 verkoopt g2 aan p2:"+(p1.verkoop(g2, p2) ? "" : " niet")+" gelukt");
        System.out.println("p1 verkoopt g1 aan p2:"+(p1.verkoop(g1, p2) ? "" : " niet")+" gelukt");
        System.out.println("\np1: " +p1+ "\n\np2: " +p2+ "\n");
    }
}

class Game{

    String naam;
    int releaseJaar;
    private double nieuwprijs;
    Game(String nm, int rJ, double nwprijs){
        nieuwprijs = nwprijs;
        releaseJaar = rJ;
        naam = nm;
    }

    public String getNaam(){
        return naam;
    }

    public double huidigeWaarde(){
        return nieuwprijs * Math.pow(0.7, (LocalDate.now().getYear() - releaseJaar));
    }

    public double getNieuwprijs() {
        return nieuwprijs;
    }

    public boolean equals(Game andereGame){
        if(andereGame.getNaam() == this.naam && andereGame.releaseJaar == this.releaseJaar){
            return true;
        }
        else{
            return  false;
        }
    }
}

class Persoon{
    private String naam;
    private double budget;
    private ArrayList<Game> games = new ArrayList<Game>();


    Persoon(String nm, double bg){
        naam = nm;
        budget = bg;
    }

    public double getBudget() {
        //return Math.round(budget * 100.0) / 100.0;
        return budget;
    }

    public boolean koop(Game game){
        if (ownsGame(game) == false && budget >= game.huidigeWaarde()){
            budget -= game.huidigeWaarde();
            games.add(game);
            //System.out.println(String.format("%s koopt %s met prijs %s, nieuw budget %s", this.naam, game.naam, game.huidigeWaarde(), this.budget));
            return true;
        }
        else{
            return false;
        }
    }

    public boolean ownsGame(Game game){
        for (Game i: games
             ) {
            if(i.equals(game)){
                return true;
            }
        }
        return false;
    }

    public boolean verkoop(Game g2, Persoon p2) {
        if (games.contains(g2) && p2.getBudget() >= g2.huidigeWaarde() && p2.ownsGame(g2) == false){
            p2.games.add(g2);
            p2.budget -= g2.huidigeWaarde();
            games.remove(g2);
            budget += g2.huidigeWaarde();
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        String outputString = String.format("%s heeft een budget van %s en bezit de volgende games: \n", this.naam, this.getBudget());
        for (Game game: games
             ) {
            outputString += String.format("%s, uitgegeven %s, nieuwprijs %s, nu voor: %s \n", game.naam, game.releaseJaar, game.getNieuwprijs(), game.huidigeWaarde());
        }
        return outputString;
    }
}