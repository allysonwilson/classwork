package example.codeclan.com.composition_start;

/**
 * Created by user on 28/08/2017.
 */

import static org.junit.Assert.*;
import org.junit.*;

import example.codeclan.com.composition_start.wizard_management.*;

public class WizardTest {

    Wizard wizard;
    Broomstick broomstick;

    @Before
    public void before(){
        broomstick = new Broomstick("Nimbus", 10);
        wizard = new Wizard("Toby", broomstick);
    }

    @Test
    public void hasName(){
        assertEquals("Toby", wizard.getName());
    }

    @Test
    public void hasRide(){
//        act
        flyable ride = wizard.getRide();
//        assert
        Broomstick broomstick = (Broomstick)ride;
        assertEquals("Nimbus", wizard.getRide().getBrand());
    }

    @Test
    public void canFly(){
        assertEquals(wizard.fly(),"mounting broom, running, skipping, flying!");
    }
    @Test
    public void canFlyMagicCarpet(){
//        arrange
        MagicCarpet carpet = new MagicCarpet("red");
        Wizard alladin = new Wizard("Alladin", carpet);
//        act
        String result = alladin.fly();
//        assert
        assertEquals("Hovering up, straightening out, flying off!", result)

    }
}
