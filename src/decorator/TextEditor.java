package decorator;

public class TextEditor {
    public static void main(String[] args) {
        Text text = new PlainText("I has teh text");
        System.out.println("Original Text: " + text.getText());

        text = new SpellCheckDecorator(text);
        System.out.println("After Spell Check: " + text.getText());

        text = new GrammarCheckDecorator(text);
        System.out.println("After Grammar Check: " + text.getText());
    }
}
