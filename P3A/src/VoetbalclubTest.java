import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {

    private Voetbalclub VC;

    @BeforeEach
    public void init(){
        System.out.println("init");
        VC = new Voetbalclub("");
    }

    @Test
    public void FCTest() {
        assertEquals("FC", VC.getNaam());
    }

    @Test
    public void ScoreTest() {
        VC.verwerkResultaat('w');
        VC.verwerkResultaat('w');
        VC.verwerkResultaat('g');
        VC.verwerkResultaat('w');
        VC.verwerkResultaat('v');
        VC.verwerkResultaat('a');
        assertEquals(10, VC.aantalPunten());
    }

    @Test
    public void ToStringTest() {
        VC.verwerkResultaat('w');
        VC.verwerkResultaat('w');
        VC.verwerkResultaat('g');
        VC.verwerkResultaat('w');
        VC.verwerkResultaat('v');
        VC.verwerkResultaat('a');
        assertEquals("FC 5 3 1 1 10", VC.toString());
    }


    @Test
    public void HerhalingTest() {
        VC.verwerkResultaat('w');
        VC.verwerkResultaat('w');
        VC.verwerkResultaat('g');
        VC.verwerkResultaat('w');
        VC.verwerkResultaat('v');
        VC.verwerkResultaat('w');
        VC.verwerkResultaat('w');
        VC.verwerkResultaat('g');
        VC.verwerkResultaat('w');
        VC.verwerkResultaat('v');
        VC.verwerkResultaat('a');
        assertEquals(10, VC.aantalGespeeld());
        assertEquals(20, VC.aantalPunten());
    }

}