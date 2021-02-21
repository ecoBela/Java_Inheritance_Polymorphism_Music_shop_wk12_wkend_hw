import items.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {
    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("B string", 5.00, 20.00);
    }

    @Test
    public void hasItemName(){
        assertEquals("B string", guitarStrings.getItemName());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(5.00, guitarStrings.getBuyingPrice(), 0.00);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(20.00, guitarStrings.getSellingPrice(), 0.00);
    }


    



}
