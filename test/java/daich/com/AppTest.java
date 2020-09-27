package daich.com;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Before
    public void setUp() {
    }

    @After
    public void termDown() {
    }

    /**
     * Test
     */
    @Test
    public void noArgs() {
        App.main();
    }

    /**
     * Test
     */
    public void emptyArgs() {
        App.main("");
    }

    /**
     * Test
     */
    public void twoArgs() {
        App.main("TSentence", "TSentence2");
    }

    /**
     * Test
     */
    public void invalidArgs() {
        App.main("TSentence2");
    }

    /**
     * Test
     */
    public void validArgs() {
        App.main("TSentence");
    }

}
