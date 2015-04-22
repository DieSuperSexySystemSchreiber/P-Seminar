import com.itextpdf.text.Document;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.PageSize;
import java.awt.Desktop;

import java.io.FileOutputStream;
import java.io.File;

public class V2 {
    //public static final String Pfad;
    public static File F;

    public static void PDFAGListe(String[] Liste, int Aufgabenanzahl)
    {
        Document Doc = new Document();
        // Rectangle braucht man, um die Größe des Documents einstellen zu können (Breite,Höhe) ( 72 == 1 Inch, DIN A4 = 8.2 x 11.6 Inches )
        Rectangle Rec = new Rectangle(PageSize.A4);
        //Die im Rectangle eingegebene Größe auf das Document übernehmen
        Doc.setPageSize(Rec);
        try 
        {
            F = File.createTempFile("Blatt",".pdf");
            PdfWriter.getInstance(Doc,new FileOutputStream(F));
            // Öffnen um es bearbeiten zu können
            Doc.open();
            // Paragraph == ungefähr Textzeile
            for (int i = 0; i < Aufgabenanzahl; i++)
            {
                if ( i == 0 )
                {
                    Paragraph Paras = new Paragraph();
                    Paras.add("Folgende Aufgabeneinstellungen wurden gewählt:" + Liste[0]);
                    Doc.add(Paras);
                }
                Paragraph Paras = new Paragraph();
                Paras.add("\n \n" + Liste[i]);
                Doc.add(Paras);
            }

            // Paragraph.add fügt der Zeile Text hinzu
            //Paragraph.add("Klappt es jetzt immer noch?");
            // Paragraph auf Document hinzufügen
            //Doc.add(Para);
            // Document wieder schließen
            Doc.close();
            Desktop.getDesktop().open(F);
        }  
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public static void PDFAGAB(String[] Liste, int Aufgabenanzahl)
    {

        Document Doc = new Document();
        // Rectangle braucht man, um die Größe des Documents einstellen zu können (Breite,Höhe) ( 72 == 1 Inch, DIN A4 = 8.2 x 11.6 Inches )
        Rectangle Rec = new Rectangle(PageSize.A4);
        //Die im Rectangle eingegebene Größe auf das Document übernehmen
        Doc.setPageSize(Rec);
        try 
        {
            F = File.createTempFile("Blatt",".pdf");
            PdfWriter.getInstance(Doc,new FileOutputStream(F));
            Doc.open();
            // Paragraph == ungefähr Textzeile

            for (int i = 0; i < Aufgabenanzahl; i++)
            {
                if ( i == 0 )
                {
                    Paragraph Paras = new Paragraph();
                    Paras.add("Folgende Aufgabeneinstellungen wurden gewählt:" + Liste[0]);
                    Doc.add(Paras);
                }
                Paragraph Paras = new Paragraph();
                Paras.add("\n \n \n \n \n " + Liste[i]);
                Doc.add(Paras);
            }

            // Paragraph.add fügt der Zeile Text hinzu
            //Paragraph.add("Klappt es jetzt immer noch?");
            // Paragraph auf Document hinzufügen
            //Doc.add(Para);
            // Document wieder schließen
            Doc.close();
            Desktop.getDesktop().open(F);
        }  
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

} 
