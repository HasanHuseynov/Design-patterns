package decorator;

public class GrammarCheckDecorator extends TextDecorator {

    public GrammarCheckDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getText() {
        return addGrammarCheck(decoratedText.getText());
    }

    private String addGrammarCheck(String text) {
        return text.replace("I has", "I have");
    }
}