package Language;

import com.intellij.lang.Language;

public class MapleLanguage extends Language
{
    public static final MapleLanguage INSTANCE = new MapleLanguage();

    private MapleLanguage()
    {

        super("Maple");
    }
}