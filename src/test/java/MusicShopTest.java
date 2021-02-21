import behaviours.ISell;
import items.Item;
import org.junit.Before;
import org.junit.Test;
import shop.MusicShop;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {
    String name;
    MusicShop musicShop;


    @Before
    public void before(){
        musicShop = new MusicShop("Max's music store");
    }

    @Test
    public void storeHasName(){
        assertEquals("Max's music store", musicShop.getName());
    }
}
