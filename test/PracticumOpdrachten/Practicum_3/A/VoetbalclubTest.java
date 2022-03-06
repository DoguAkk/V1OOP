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
    void clubnaamLeeg(){
        assertEquals("FC", club1.getName());
    }

    @Test
    void fouteInvoer() {
        club1.verwerkResultaat('x');
        assertEquals(0, club1.aantalPunten());
    }

    @Test
    void resultaten() {
        club1.verwerkResultaat('w');
        club1.verwerkResultaat('g');
        club1.verwerkResultaat('v');
        String verwacht = "Winst levert " + club1.getAantalGewonnen() + " punten op.\n"
                + "Gelijkspel levert " + club1.getAantalGelijk() + " punt op.\n"
                + "verlies levert " + club1.getAantalVerloren() + " punten op.";
        assertEquals(verwacht, club1.toString());
    }

    @Test
    void resultatenOptellen() {
        club1.verwerkResultaat('w');
        club1.verwerkResultaat('g');
        club1.verwerkResultaat('v');
    }

}