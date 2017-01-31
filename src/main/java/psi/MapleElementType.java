package psi;

import Language.MapleLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.*;

public class MapleElementType extends IElementType
{
    public MapleElementType(@NotNull @NonNls String debugName)
    {
        super(debugName, MapleLanguage.INSTANCE);
    }
}