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

import java.io.FileOutputStream;
import java.io.File;
public class V2 {
    public static File F;
    public static List List;
    public void PDFAB(String Headline, int AmountExer, PDFSETTINGSGUI k)
    {
        Document Doc = new Document();
        Rectangle Rec = new Rectangle(PageSize.A4);
        Doc.setPageSize(Rec);
        try
        {
            F = File.createTempFile("Blatt",".pdf");
            PdfWriter.getInstance(Doc, new FileOutputStream(F));
            Doc.open();
            Paragraph Para = new Paragraph(Headline + " vom " + DATE.getDate(), FONTS.FontHeader());
            Para.setAlignment(Element.ALIGN_CENTER);
            Doc.add(Para);
            for (int i = 1; i <= AmountExer; i++)
            {
                List = new List(List.ORDERED, List.ALPHABETICAL);
                Doc.add(new Paragraph("Aufgabe" + i, FONTS.Font()));
                for ( int c = 0; c < k.tasks; c++)
                {
                    List.add(new ListItem(new TERM(k.aoAddition,k.aoSubtraction,k.aoMultiplication,aoDivision,k.bracketDepht,k.Substitutions,k.Digits,k.justPositive,k.withFraction).infix()));
                }
                k = k.next;
                Doc.add(List);
            }
            Doc.close();
            Desktop.getDesktop().open(F);
        }  
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
