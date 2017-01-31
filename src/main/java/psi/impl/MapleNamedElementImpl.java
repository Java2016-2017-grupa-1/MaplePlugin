package psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import psi.MapleNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class MapleNamedElementImpl extends ASTWrapperPsiElement implements MapleNamedElement {
	public MapleNamedElementImpl(@NotNull ASTNode node) {
		super(node);
	}
}