
import com.intellij.lang.*;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import com.intellij.psi.tree.*;
import generated.parser.MapleParser;
import generated.psi.*;
import org.jetbrains.annotations.NotNull;
import Language.*;
import psi.*;

public class MapleParserDefinition implements ParserDefinition {
	public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
	public static final TokenSet COMMENTS = TokenSet.create(MapleTypes.COMMENT);

	public static final IFileElementType FILE =
			new IFileElementType(Language.<MapleLanguage>findInstance(MapleLanguage.class));

	@NotNull
	@Override
	public Lexer createLexer(Project project) {
		return new MapleLexerAdapter();
	}

	@NotNull
	public TokenSet getWhitespaceTokens() {
		return WHITE_SPACES;
	}

	@NotNull
	public TokenSet getCommentTokens() {
		return COMMENTS;
	}

	@NotNull
	public TokenSet getStringLiteralElements() {
		return TokenSet.EMPTY;
	}

	@NotNull
	public PsiParser createParser(final Project project) {
		return new MapleParser();
	}

	@Override
	public IFileElementType getFileNodeType() {
		return FILE;
	}

	public PsiFile createFile(FileViewProvider viewProvider) {
		return new MapleFile(viewProvider);
	}

	public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
		return SpaceRequirements.MAY;
	}

	@NotNull
	public PsiElement createElement(ASTNode node) {
		return MapleTypes.Factory.createElement(node);
	}
}