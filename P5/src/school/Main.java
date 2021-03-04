package school;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) {
        Klas k = new Klas("V1Z");
        Leerling l = new Leerling("Hans");
        k.voegLeerlingToe(l);
        l = new Leerling("Jan");
        k.voegLeerlingToe(l);
        l = new Leerling("Wim");
        k.voegLeerlingToe(l);
        System.out.println(k);
        k.wijzigCijfer("Hans", 7.6);
        k.wijzigCijfer("Klaas", 7.6);
        System.out.println(k.toString());
        System.out.println("Aantal leerlingen: " + k.aantalLeerlingen());
    }
}

class Klas {
    private String klascode;
    private ArrayList<Leerling> Leerlingen = new ArrayList<Leerling>();
    public Klas(String kc){
        this.klascode = kc;
    }
    public void voegLeerlingToe(Leerling ll){
        Leerlingen.add(ll);
    }
    public void wijzigCijfer(String ll, double cijfer){
        System.out.println("loop");
        for (Leerling i:Leerlingen) {
            System.out.println("match " + i.getNaam());
            System.out.println("tegen " + ll);
            if(i.getNaam() == ll){
                System.out.println("match");
                i.setCijfer(cijfer);
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return Leerlingen;
    }

    public String toString(){
        String outputString = String.format("in klas %s zitten de volgende leerlingen \n", this.klascode);
        for (Leerling i:Leerlingen){
            outputString += String.format("%s heeft cijfer: %s\n", i.getNaam(), i.getCijfer() );
        }
        return outputString;
    }

    public int aantalLeerlingen() {
        return Leerlingen.size();
    }
}

class Leerling{
    private String Naam;
    private double Cijfer = 0.0;
    public Leerling(String naam){
        this.Naam = naam;
    }

    public double getCijfer() {
        return Cijfer;
    }

    public String getNaam() {
        return Naam;
    }

    public void setCijfer(double cijfer) {
        Cijfer = cijfer;
    }
}