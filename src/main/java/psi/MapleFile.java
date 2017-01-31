package psi;

import Language.MapleFileType;
import Language.MapleLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class MapleFile extends PsiFileBase {
	public MapleFile(@NotNull FileViewProvider viewProvider) {
		super(viewProvider, MapleLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public FileType getFileType() {
		return MapleFileType.INSTANCE;
	}

	@Override
	public String toString() {
		return "Maple File";
	}

	@Override
	public Icon getIcon(int flags) {
		return super.getIcon(flags);
	}
}