package decorator;

public abstract class TextDecorator implements Text {
    protected Text decoratedText;

    public TextDecorator(Text decoratedText) {
        this.decoratedText = decoratedText;
    }

    @Override
    public String getText() {
        return decoratedText.getText();
    }

    @Override
    public void setText(String text) {
        decoratedText.setText(text);
    }
}
