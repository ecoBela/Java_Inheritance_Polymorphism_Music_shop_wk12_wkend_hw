import items.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Classical Guitar", 30, 100,
                "brown", "spruce", 6);
    }

    @Test
    public void hasNoOfStrings(){
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("tring, tring, tring", guitar.play("tring, tring, tring"));
    }


}
