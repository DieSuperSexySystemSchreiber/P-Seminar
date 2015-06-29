import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
public class FONTS
{
    static int x = 0;
    public static Font Font()
    {
        Font font = FontFactory.getFont("Helvetica",12);
        return font;
    }
    public static Font FontHeader()
    {
        Font font = FontFactory.getFont("Helvetica", 18, Font.BOLD);
        return font;
    }
}