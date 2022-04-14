package PracticumOpdrachten.Practicum_4.B;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    private AutoHuur a;
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    @BeforeEach
    public void init(){
        a = new AutoHuur();
    }
}