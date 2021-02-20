package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class AutoHuurTest{
    private AutoHuur AH;
    private Klant kl1;
    private Auto a2;

    @BeforeEach
    public void init()  {
        System.out.println("Init");
        AH = new AutoHuur();

    }

    @Test
    void berekenPrijsTest() {
        System.out.println("Autohuurdersettest");
        a2 = new Auto("Auto", 100);
        kl1 = new Klant("Meneer Jansen");
        kl1.setKorting(20);
        AH.setHuurder(kl1);
        AH.setGehuurdeAuto(a2);
        assertEquals(0, AH.totaalprijs());
    }
    @Test
    void berekenPrijsTest2() {
        System.out.println("Autohuurdersettest");
        a2 = new Auto("Auto", 100);
        kl1 = new Klant("Meneer Jansen");
        kl1.setKorting(20);
        AH.setHuurder(kl1);
        AH.setGehuurdeAuto(a2);
        AH.setAantalDagen(5);
        assertEquals(400, AH.totaalprijs());
    }

    @Test
    void berekenPrijsTest3() {
        System.out.println("Autohuurdersettest");
        a2 = new Auto("Auto", 100);
        kl1 = new Klant("Meneer Jansen");
        kl1.setKorting(20);
        //AH.setHuurder(kl1);
        AH.setGehuurdeAuto(a2);
        AH.setAantalDagen(5);
        assertEquals(0, AH.totaalprijs());
    }

    @Test
    void berekenPrijsTest4() {
        System.out.println("Autohuurdersettest");
        a2 = new Auto("Auto", 100);
        kl1 = new Klant("Meneer Jansen");
        kl1.setKorting(20);
        AH.setHuurder(kl1);
        //AH.setGehuurdeAuto(a2);
        AH.setAantalDagen(5);
        assertEquals(0, AH.totaalprijs());
    }

    @Test
    void berekenPrijsTest5() {
        System.out.println("test");
        //a2 = new Auto("Auto", 100);
        kl1 = new Klant("Meneer Jansen");
        kl1.setKorting(20);
        AH.setHuurder(kl1);
        AH.setGehuurdeAuto(a2);
        AH.setAantalDagen(5);
        assertEquals(0, AH.totaalprijs());
    }

    @Test
    void berekenPrijsTest6() {
        System.out.println("test");
        //a2 = new Auto("Auto", 100);
        kl1 = new Klant("Meneer Jansen");
        kl1.setKorting(20);
        AH.setHuurder(kl1);
        AH.setGehuurdeAuto(a2);
        AH.setAantalDagen(5);
        assertEquals(0, AH.totaalprijs());
    }
}