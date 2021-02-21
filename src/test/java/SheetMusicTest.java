import items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Piano score", 1.00, 7.00);
    }

    @Test
    public void hasItemName(){
        assertEquals("Piano score", sheetMusic.getItemName());
    }
}
