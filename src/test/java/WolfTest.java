import org.junit.*;

import static org.junit.Assert.assertEquals;

public class WolfTest {
    Wolf w;
    @Before
    public void setUp() throws Exception {
        w = new Wolf();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("awhooooo", w.sound());
    }

    @Test(timeout = 50)
    public void testGetPrice() {
        assertEquals(14, w.getPrice());
    }
}
