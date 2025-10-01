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
    public void testMain() {
        Main.main(null);
    }

    @After
    public void testAfter() {
        Main.isRunningTest = false;
    }
}
