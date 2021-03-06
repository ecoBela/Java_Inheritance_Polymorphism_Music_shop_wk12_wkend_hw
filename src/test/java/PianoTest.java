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
                600.00, 800.00,
                "black", "beech", 3);
    }

    @Test
    public void hasItemName(){
        assertEquals("Upright Piano", piano.getItemName());

    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(600.00, piano.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(800.00, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("black", piano.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("beech", piano.getMaterial());
    }

    @Test
    public void hasNoOfPedals(){
        assertEquals(3, piano.getNoOfPedals());
    }

    @Test
    public void canPlay(){
        assertEquals("da da da la la", piano.play("da da da la la"));
    }

    @Test
    public void checkMarkUp(){
        assertEquals(33.33, piano.calcMarkUp(), 0.01);
    }


}
