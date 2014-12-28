package icf.frontend.token;

import icf.frontend.Source;

public class Token<T> {
    protected TokenType type;
    protected String text;
    protected T value;
    protected Source source;
    protected int lineNumber;
    protected int position;

    public Token(Source source) throws Exception {
        this.source = source;
        this.lineNumber = source.getLineNumber();
        this.position = source.getPosition();
        extract();
    }

    protected void extract() throws Exception {
        text = Character.toString(currentChar());
        value = null;
        nextChar();
    }

    protected char currentChar() throws Exception {
        return source.currentChar();
    }

    protected char nextChar() throws Exception {
        return source.nextChar();
    }

    protected char peekChar() throws Exception {
        return source.peekChar();
    }

}