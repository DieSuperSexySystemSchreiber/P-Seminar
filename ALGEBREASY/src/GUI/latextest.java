/*
Copyright (C) <2015>  <name of author>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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
