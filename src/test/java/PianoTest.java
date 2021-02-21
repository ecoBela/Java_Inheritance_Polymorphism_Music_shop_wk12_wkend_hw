import items.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano(
                "Upright Piano",
                400.00, 800.00,
                "black", "beech", 3);
    }

    @Test
    public void hasItemName(){
        assertEquals("Upright Piano", piano.getItemName());

    }


}
