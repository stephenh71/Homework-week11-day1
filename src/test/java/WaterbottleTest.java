import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterbottleTest {

    Waterbottle waterbottle;

    @Before
    public void before() {
        waterbottle = new Waterbottle(100);
    }

    @Test
    public void drink(){
        assertEquals(90, waterbottle.drink());
        assertEquals(80, waterbottle.drink());
        assertEquals(70, waterbottle.drink());
    }

    @Test
    public void empty(){
        assertEquals(0, waterbottle.empty());
    }

    @Test
    public void fill(){
        assertEquals(100, waterbottle.fill());
    }
}
