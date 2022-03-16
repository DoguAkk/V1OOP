package PracticumOpdrachten.Practicum_3.A;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class VoetbalclubTest {
    private Voetbalclub club1;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    @BeforeEach
    public void init() {
        club1 = new Voetbalclub();
    }

    @Test
    void fouteInvoer() {
        club1.verwerkResultaat('u');
        assertEquals(0, club1.aantalPunten());
    }

    @Test
    void foutInvoerAantalGespeeld(){
        club1.verwerkResultaat('p');
        assertEquals(0, club1.aantalGespeeld());
    }


    @Test
    void resultaten() {
        club1.verwerkResultaat('w');
        club1.verwerkResultaat('v');
        club1.verwerkResultaat('g');
        String tekst = club1.getName() + " " +
                club1.aantalGespeeld() + " " +
                club1.getAantalGewonnen() + " " +
                club1.getAantalGelijk() + " " +
                club1.getAantalVerloren() + " " +
                club1.aantalPunten();

        assertEquals(tekst, club1.toString());
    }

    @Test
    void resultatenOpetellen() {
        club1.verwerkResultaat('w');
        club1.verwerkResultaat('w');
        String tekst = club1.getName() + " " +
                club1.aantalGespeeld() + " " +
                club1.getAantalGewonnen() + "  " +
                club1.getAantalGelijk() + " " +
                club1.getAantalVerloren() + " " +
                club1.aantalPunten();
        assertEquals(tekst, club1.toString());
    }


}