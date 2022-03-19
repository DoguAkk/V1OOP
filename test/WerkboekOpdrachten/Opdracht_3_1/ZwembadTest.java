package WerkboekOpdrachten.Opdracht_3_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZwembadTest{
    private Zwembad z;

    @BeforeEach
    public void init(){
        z = new Zwembad(2, 2, 2);
    }

    @Test
    public void testBerekenDeInhoud(){
        assertEquals(8, z.inhoud(), "Inhoud klopt niet!");
    }

}