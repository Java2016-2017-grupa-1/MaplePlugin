import com.intellij.lexer.FlexAdapter;

import java.io.Reader;


public class MapleLexerAdapter extends FlexAdapter {
	public MapleLexerAdapter() {
		super(new MapleLexer((Reader) null));
	}
}