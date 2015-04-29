

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse BINAERBAUMTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class BINAERBAUMTest
{
    private DATENELEMENT dATENELE1;
    private DATENELEMENT dATENELE2;
    private DATENELEMENT dATENELE3;
    private DATENKNOTEN dATENKNO1;
    private DATENKNOTEN dATENKNO2;
    private DATENKNOTEN dATENKNO3;
    private BINAERBAUM bINAERBA1;

    
    
    
    
    
    
    

    /**
     * Konstruktor fuer die Test-Klasse BINAERBAUMTest
     */
    public BINAERBAUMTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
        dATENELE1 = new DATENELEMENT(3);
        dATENELE2 = new DATENELEMENT(2);
        dATENELE3 = new DATENELEMENT(1);
        dATENKNO1 = new DATENKNOTEN(dATENELE1);
        dATENKNO2 = new DATENKNOTEN(dATENELE2);
        dATENKNO3 = new DATENKNOTEN(dATENELE3);
        dATENKNO1.setzeLinkerNaechster(dATENKNO2);
        dATENKNO1.setzeRechterNaechster(dATENKNO3);
        bINAERBA1 = new BINAERBAUM();
        bINAERBA1.wurzelSetzten(dATENKNO1);
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }
}
