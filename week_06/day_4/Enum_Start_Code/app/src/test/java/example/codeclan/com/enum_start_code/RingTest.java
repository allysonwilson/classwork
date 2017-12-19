package example.codeclan.com.enum_start_code;

/**
 * Created by user on 29/08/2017.
 */

import static org.junit.Assert.*;
import org.junit.*;

public class RingTest {

    Ring ring;

    @Before
    public void before(){
        ring = new Ring(MetalType.GOLD, GemType.EMERALD);
    }

    @Test
    public void canGetMetal(){
        assertEquals(MetalType.GOLD,ring.getMetal());
    }

    @Test
    public void canGetGem() { assertEquals(GemType.EMERALD, ring.getGem() ); }
}
//    @Test
//    public void metalCanBeMispelled() {
//        ring = new Ring("Gollld");
//        assertEquals("Gollld", ring.getMetal());
//    }

