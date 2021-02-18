package com.company;

public class AutoHuur {
    private Klant huurder;
    private Auto gehuurdeAuto;
    private int aantalDagen;

    AutoHuur() {

    }

    public void setAantalDagen(int ant) {
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

    public Klant GetHuurder() { return huurder; }

    public double totaalprijs() {
        if (huurder == null | gehuurdeAuto == null){
            return 0;
        }

        return(this.gehuurdeAuto.getPrijsPerDag() * this.aantalDagen * (1 - (this.huurder.getKorting() / 100)));
    };

    public String toString() {

        String outputString = "";

        if (gehuurdeAuto != null) {
            outputString += "autotype:" + gehuurdeAuto.toString() + "\n";
        }

        if (gehuurdeAuto == null) {
            outputString += "er is geen auto bekend \n";
        }

        if (huurder != null) {
            outputString += "Op naam van:" + huurder.toString() + "\n";
        }

        if (huurder == null) {
            outputString += "er is geen huurder bekend \n";
        }

        if (huurder != null && gehuurdeAuto != null) {
            outputString += String.format("Aantal dagen: %s en dat kost %s ",
                    this.aantalDagen,
                    this.totaalprijs()
            );
        }

        if (aantalDagen == 0) {
            outputString += "Aantal dagen: 0 en dat kost 0.0";
        }


        return (outputString);

    }
}
