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
import com.itextpdf.text.Image;

import java.awt.Desktop;
import java.util.Hashtable;

import java.io.FileOutputStream;
import java.io.File;

public class PDFGEN {
    private static File F;
    private static File G;
    private static List List;
    private MEMORY First;
    private MEMORY Current;
    public void PDFAB ( String Headline, int AmountExer, GUISETTINGSPDF k)
    {
        Document Doc = new Document();
        Rectangle Rec = new Rectangle(PageSize.A4);
        Doc.setPageSize(Rec);
        try
        {
            F = File.createTempFile("Blatt",".pdf");
            PdfWriter.getInstance(Doc, new FileOutputStream(F));
            Doc.open();
            Paragraph Para = new Paragraph(Headline, FONTS.FontHeader());
            Para.setAlignment(Element.ALIGN_CENTER);
            Doc.add(Para);
            First = new MEMORY();
            Current = First;
            GUISETTINGSPDF D = k;
            //Image Img = Image.getInstance("Logo");
            //Doc.add(Img);
            for (int i = 1; i <= AmountExer; i++)
            {
                List = new List(List.ORDERED, List.ALPHABETICAL);
                for ( int c = 0; c < k.taskNumber; c++)
                {
                    TERM Term = new TERM(k.aoAddition,k.aoSubtraction,k.aoMultiplication,k.aoDivision,k.bracketDepht,k.Substitutions,k.Digits,k.decimalPlaces,k.justPositive);
                    Current.writeExercise(Term.infix() + "=");
                    Current.writeSolution(Double.parseDouble(Term.getSolution()));
                    List.add(new ListItem(Current.readExercise()));
                    Current.Next = new MEMORY();
                    Current = Current.Next;
                }
                Doc.add(new Paragraph(" \n Aufgabe " + i, FONTS.Font()));
                k = k.next;
                Doc.add(List);
            }
            Doc.close();
            Desktop.getDesktop().open(F);
            PDFLB(AmountExer, D);
            Desktop.getDesktop().open(G);
        }  
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void PDFLB (int AmountExer, GUISETTINGSPDF k)
    {
        Document Doc = new Document();
        Rectangle Rec = new Rectangle(PageSize.A4);
        Doc.setPageSize(Rec);
        try
        {
            G = File.createTempFile("Blatt",".pdf");
            PdfWriter.getInstance(Doc, new FileOutputStream(G));
            Doc.open();
            Paragraph Para = new Paragraph("Lösungsblatt", FONTS.FontHeader());
            Para.setAlignment(Element.ALIGN_CENTER);
            Doc.add(Para);
            for (int i = 1; i <= AmountExer; i++)
            {
                List = new List(List.ORDERED, List.ALPHABETICAL);
                for (int c = 0; c < k.taskNumber; c++)
                {
                    String S = First.readExercise() + First.readSolution();
                    List.add(new ListItem(S));
                    First = First.Next;
                }
                Doc.add(new Paragraph(" \n Aufgabe" + i, FONTS.Font()));
                Doc.add(List);
                k = k.next;
            }
            Doc.close();
        }  
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

