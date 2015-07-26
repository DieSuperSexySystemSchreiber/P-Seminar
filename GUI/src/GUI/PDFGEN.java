package GUI;

import com.itextpdf.text.Element;
import com.itextpdf.text.Document;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;

import java.awt.Desktop;
import java.util.Hashtable;

import java.io.FileOutputStream;
import java.io.File;
public class PDFGEN {
    public static File F;
    public static File G;
    public static List List;
    public String[][] Exercises;
    public void PDFAB ( String Headline, int AmountExer, GUISETTINGSPDF k, boolean Lösungen )
    {
        Document Doc = new Document();
        Rectangle Rec = new Rectangle(PageSize.A4);
        Doc.setPageSize(Rec);
        try
        {
            F = File.createTempFile("Blatt",".pdf");
            PdfWriter.getInstance(Doc, new FileOutputStream(F));
            Exercises = new String[AmountExer][100];
            Doc.open();
            Paragraph Para = new Paragraph(Headline + " vom " + DATE.getDate(), FONTS.FontHeader());
            Para.setAlignment(Element.ALIGN_CENTER);
            Doc.add(Para);
            for (int i = 1; i <= AmountExer; i++)
            {
                List = new List(List.ORDERED, List.ALPHABETICAL);
                for ( int c = 0; c < k.taskNumber && c < 100 ; c++)
                {
                    Exercises[i][c] = new TERM(k.aoAddition,k.aoSubtraction,k.aoMultiplication,k.aoDivision,k.bracketDepht,k.Substitutions,k.Digits,k.decimalPlaces,k.justPositive,k.withFraction).infix() + "=";
                    List.add(new ListItem(Exercises[i][c]));
                }
                Doc.add(new Paragraph(" /n Aufgabe" + i, FONTS.Font()));
                k = k.next;
                Doc.add(List);
            }
            Doc.close();
            Desktop.getDesktop().open(F);
            if ( Lösungen == true )
            {
//                PDFLB(Headline, AmountExer);
            }
            Desktop.getDesktop().open(G);
        }  
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /*public void PDFLB (String Headline, int AmountExer)
    {
        Document Doc = new Document();
        Rectangle Rec = new Rectangle(PageSize.A4);
        Doc.setPageSize(Rec);
        try
        {
            G = File.createTempFile("Blatt",".pdf");
            PdfWriter.getInstance(Doc, new FileOutputStream(G));
            Doc.open();
            Paragraph Para = new Paragraph("Lösungsblatt zu" + Headline + " vom " + DATE.getDate(), FONTS.FontHeader());
            Para.setAlignment(Element.ALIGN_CENTER);
            Doc.add(Para);
            Löser Module = new Löser();
            int c = 0;
            for (int i = 1; i <= AmountExer; i++)
            {
                List = new List(List.ORDERED, List.ALPHABETICAL);
                while ( Exercises[i][c] != null )
                {
                    Exercises[i][c] = Exercises[i][c] + Module.lösen(Exercises[i][c]);
                    List.add(new ListItem(Exercises[i][c]));
                    c = c++;
                }
                Doc.add(new Paragraph(" /n Aufgabe" + i, FONTS.Font()));
                Doc.add(List);
            }
            Doc.close();
        }  
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }*/

}

