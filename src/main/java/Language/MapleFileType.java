package Language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by bartlomey on 03.01.2017.
 */
public class MapleFileType extends LanguageFileType
{

    public static final MapleFileType INSTANCE = new MapleFileType();

    private MapleFileType()
    {
        super(MapleLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName()
    {
        return "Maple file";
    }

    @NotNull
    @Override
    public String getDescription()
    {
        return "Maple language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension()
    {
        return "mpl";
    }

    @Nullable
    @Override
    public Icon getIcon()
    {
        return null;
    }
}
