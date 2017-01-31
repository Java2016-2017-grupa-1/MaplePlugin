import Language.MapleFileType;
import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;


/**
 * Created by bartlomey on 03.01.2017.

 */



public class MapleFileTypeFactory extends FileTypeFactory
{
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer)
    {
        consumer.consume(MapleFileType.INSTANCE, "maple");
    }
}
