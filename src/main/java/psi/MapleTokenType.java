package psi;

import Language.MapleLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.*;

public class MapleTokenType extends IElementType
{
    public MapleTokenType(@NotNull @NonNls String debugName)
    {
        super(debugName, MapleLanguage.INSTANCE);
    }

    @Override
    public String toString()
    {
        return "MapleTokenType." + super.toString();
    }
}