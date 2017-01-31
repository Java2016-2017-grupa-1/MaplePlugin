// This is a generated file. Not intended for manual editing.
package main.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static main.psi.MapleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import main.psi.*;

public class MaplePropertyImpl extends ASTWrapperPsiElement implements MapleProperty {

  public MaplePropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MapleVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MapleVisitor) accept((MapleVisitor)visitor);
    else super.accept(visitor);
  }

}
