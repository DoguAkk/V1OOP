package PracticumOpdrachten.Practicum_3.A;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    private Voetbalclub v;

    @BeforeEach
    public void init(){
        v = new Voetbalclub("");
    }

    @Test
    public void naamIsNull(){
        v.getNaam();
        assertEquals("FC", v.getNaam());
    }

    @Test
    public void foutieveInvoer(){
        v.verwerkResultaat('x');
        assertEquals(0, v.aantalPunten(), "aantal punten klopt niet!");
        assertEquals(0, v.aantalGespeeld(), "aantal wedstrijden klopt niet!");
    }

    @Test
    public void resultaten(){
        v.verwerkResultaat('w');
        v.verwerkResultaat('g');
        v.verwerkResultaat('v');
        String resultaat = v.getNaam() + "\t" + v.aantalGespeeld() + " " + v.getAantalGewonnen() + " " + v.getAantalGelijk() + " " + v.getAantalVerloren() + " " + v.aantalPunten();
        assertEquals(resultaat, v.toString());
    }

    @Test
    public void resultatenOptellen(){
        v.verwerkResultaat('w');
        v.verwerkResultaat('w');
        v.verwerkResultaat('g');
        assertEquals(7, v.aantalPunten());
    }




}