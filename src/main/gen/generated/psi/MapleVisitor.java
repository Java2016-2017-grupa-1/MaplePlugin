// This is a generated file. Not intended for manual editing.
package generated.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import psi.MapleNamedElement;

public class MapleVisitor extends PsiElementVisitor {

  public void visitProperty(@NotNull MapleProperty o) {
    visitNamedElement(o);
  }

  public void visitNamedElement(@NotNull MapleNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
