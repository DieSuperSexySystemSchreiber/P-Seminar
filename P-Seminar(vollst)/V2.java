import com.itextpdf.text.Element;
import com.itextpdf.text.Document;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Font;
import java.awt.Desktop;

import java.io.FileOutputStream;
import java.io.File;

public class V2 {
    //public static final String Pfad;
    public static File F;

    public static void PDFAGListe(String[] Liste, int ArrayLength)
    {
        Document Doc = new Document();
        // Use Rectangle to set the dimensions of the document (width,hight) ( 72 == 1 Inch, DIN A4 = 8.2 x 11.6 Inches )
        Rectangle Rec = new Rectangle(PageSize.A4);
        //Assume the entered dimension to the document
        Doc.setPageSize(Rec);
        try 
        {
            F = File.createTempFile("Blatt",".pdf");
            PdfWriter.getInstance(Doc,new FileOutputStream(F));
            // Open to edit
            Doc.open();
            // Paragraph == approximate line
            for (int i = 0; i < ArrayLength; i++)
            {
                if ( i == 0 )
                {
                    Paragraph Para = new Paragraph("Aufgabenblatt vom " + DATE.getDate(), FONTS.FontHeader());
                    Paragraph Paras = new Paragraph("Folgende Aufgabeneinstellungen wurden gewählt: \n" + Liste[0], FONTS.Font());
                    Para.setAlignment(Element.ALIGN_CENTER);
                    Paras.setAlignment(Element.ALIGN_CENTER);
                    Doc.add(Para);
                    Doc.add(Paras);
                }
                Paragraph Paras = new Paragraph();
                Paras.add("\n \n" + Liste[i]);
                Doc.add(Paras);
            }

            // Paragraph.add adds text to the line
            //Paragraph.add("Does it still work?");
            // Add Paragraph to thendocument
            //Doc.add(Para);
            // Close the document
            Doc.close();
            //open PDF
            Desktop.getDesktop().open(F);
        }  
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public static void PDFAGAB(String[] Liste, int ArrayLength)
    {

        Document Doc = new Document();
        // Use Rectangle to set the dimensions of the document (width,hight) ( 72 == 1 Inch, DIN A4 = 8.2 x 11.6 Inches )
        Rectangle Rec = new Rectangle(PageSize.A4);
        //Assume the entered dimension to the document
        Doc.setPageSize(Rec);
        try 
        {
            F = File.createTempFile("Blatt",".pdf");
            PdfWriter.getInstance(Doc,new FileOutputStream(F));
            Doc.open();
            // Paragraph == approximate line

            for (int i = 0; i < ArrayLength; i++)
            {
                if ( i == 0 )
                {
                    Paragraph Para = new Paragraph("Arbeitsblatt vom " + DATE.getDate(), FONTS.FontHeader());
                    Paragraph Paras = new Paragraph("Folgende Aufgabeneinstellungen wurden gewählt: \n" + Liste[0], FONTS.Font());
                    Para.setAlignment(Element.ALIGN_CENTER);
                    Paras.setAlignment(Element.ALIGN_CENTER);
                    Doc.add(Para);
                    Doc.add(Paras);
                }
                Paragraph Paras = new Paragraph();
                Paras.add("\n \n \n \n \n " + Liste[i]);
                Doc.add(Paras);
            }

            // Paragraph.add adds text to the line
            //Paragraph.add("Does it still work?");
            // Add Paragraph to thendocument
            //Doc.add(Para);
            // Close the document
            Doc.close();
            Desktop.getDesktop().open(F);
        }  
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

} 