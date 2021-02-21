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

    @Test
    public void hasBuyingPrice(){
        assertEquals(400.00, piano.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(800, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("black", piano.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("beech", piano.getMaterial());
    }


}
