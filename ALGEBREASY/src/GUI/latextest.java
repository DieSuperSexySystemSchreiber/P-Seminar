package src.GUI;

import java.util.Random;
import java.text.DecimalFormat;
/**
 * Beschreiben Sie hier die Klasse dfsffdsfd.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class latextest
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse 
     */
    public latextest()
    {
        System.out.println(""+getRand(0,100));
        
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    private double getRand(int min, int max) {
        Random rand = new Random();

        double toReturn= min+(rand.nextDouble()*(max-min));
        
        DecimalFormat df = new DecimalFormat("##########################.#");
        String formatted=df.format(toReturn);
        formatted=formatted.replace(",",".");
        return  Double.parseDouble(formatted);
    }
}
