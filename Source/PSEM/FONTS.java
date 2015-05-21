import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
public class FONTS
{
    static int x = 0;
    public static Font Font ()
    {
        Font font = FONTS.getFont();
        return font;
    }
    public static Font FontHeader()
    {
        x = 1;
        Font font = FONTS.getFont();
        return font;
    }
    public static Font getFont()
    {
        if ( x == 1 )
        {
            Font font = FontFactory.getFont("Helvetica", 18, Font.BOLD);
            x = 0;
            return font;
        }
        else 
        {
            Font font = FontFactory.getFont("Helvetica",12);
            return font;
        }
    }
}