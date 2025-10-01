import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ComplexTest {
    @Before
    public void testBefore() {
        Main.isRunningTest = true;
    }

    @Test
    public void testComplex() {

    }

    @Test
    public void testExit() {
        Main.main(null);
    }

    @Test
    public void testChoice1() {
        Main.testChoice = '1';
        Main.main(null);
    }

    @Test
    public void testChoice2() {
        Main.testChoice = '2';
        Main.main(null);
    }

    @Test
    public void testChoice3() {
        Main.testChoice = '3';
        Main.main(null);
    }

    @Test
    public void testChoice4() {
        Main.testChoice = '4';
        Main.main(null);
    }

    @Test
    public void testChoice5() {
        Main.testChoice = '5';
        Main.main(null);
    }

    @After
    public void testAfter() {
        Main.isRunningTest = false;
    }
}
