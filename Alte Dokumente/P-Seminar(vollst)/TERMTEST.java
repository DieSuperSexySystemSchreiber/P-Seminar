import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class TERMTEST.
 *
 * @author  (Your name)
 * @version (version or date)
 */
public class TERMTEST
{
    private TERM tERM1;

    /**
     * Constructor for the class TERMTEST
     */
    public TERMTEST()
    {
    }

    /**
     *  Sets the framework for the TEST
     *
     * Is used before every Testfall-method.
     */
    @Before
    public void setUp()
    {
        tERM1 = new TERM(true, true, true, true, 7, 8, 7, true, false);
    }

    /**
     * Releases the framework
     *
     * Is used after every Testfall-method.
     */
    @After
    public void tearDown()
    {
    }
}