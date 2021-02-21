import behaviours.ISell;
import items.*;
import org.junit.Before;
import org.junit.Test;
import shop.MusicShop;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {
    String name;
    MusicShop musicShop;
    ArrayList<ISell> stock;
    Piano piano;
    Guitar guitar;
    SheetMusic sheetMusic;
    GuitarStrings guitarStrings;


    @Before
    public void before(){
        musicShop = new MusicShop("Max's music shop");
        stock = new ArrayList<ISell>();
        piano = new Piano(
                "Grand Piano", 500.00, 1000.00,
                "black", "maple", 3
        );
        guitar = new Guitar(
                "Classical Guitar", 30, 100,
                "brown", "spruce", 6
        );
        sheetMusic = new SheetMusic(
                "Piano score", 1.00, 7.00
        );
        guitarStrings = new GuitarStrings(
                "B string", 5.00, 20.00
        );
    }

    @Test
    public void storeHasName(){
        assertEquals("Max's music shop", musicShop.getName());
    }

    @Test
    public void addItemsToStock(){
        musicShop.getStock().add(piano);
        musicShop.getStock().add(guitar);
        musicShop.getStock().add(sheetMusic);
        assertEquals(3, musicShop.getNumberOfItemsInStockList());
    }

    @Test
    public void removeItemsFromStock(){
        musicShop.getStock().add(piano);
        musicShop.getStock().add(guitar);
        musicShop.getStock().add(sheetMusic);
        musicShop.getStock().remove(piano);
        assertEquals(2, musicShop.getNumberOfItemsInStockList());

    }




}
