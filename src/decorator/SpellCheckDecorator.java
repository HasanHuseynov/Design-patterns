package decorator;

public class SpellCheckDecorator extends TextDecorator {
    public SpellCheckDecorator(Text decoratedText) {
        super(decoratedText);
    }
    @Override
    public String getText() {
        return addSpellCheck(decoratedText.getText());
    }
    private String addSpellCheck(String text) {
        return text.replace("teh", "the");
    }
}