// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;

import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.psi.MapleTypes.*;
import psi.impl.MapleNamedElementImpl;
import generated.psi.*;

public class MaplePropertyImpl extends MapleNamedElementImpl implements MapleProperty {

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

  @Nullable
  @Override
  public PsiElement getNameIdentifier() {
    return null;
  }

  @Override
  public PsiElement setName(@NonNls @NotNull String name) throws IncorrectOperationException {
    return null;
  }
}
