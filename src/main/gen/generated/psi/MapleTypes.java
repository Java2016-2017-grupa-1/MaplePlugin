// This is a generated file. Not intended for manual editing.
package generated.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import generated.psi.impl.*;
import psi.MapleElementType;
import psi.MapleTokenType;

public interface MapleTypes {

  IElementType PROPERTY = new MapleElementType("PROPERTY");

  IElementType COMMENT = new MapleTokenType("COMMENT");
  IElementType KEY = new MapleTokenType("KEY");
  IElementType SEPARATOR = new MapleTokenType("SEPARATOR");
  IElementType VALUE = new MapleTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new MaplePropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
