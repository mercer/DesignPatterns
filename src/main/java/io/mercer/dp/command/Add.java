package io.mercer.dp.command;

public class Add implements Command {

    private Document document;
    private String text;

    public Add(Document document, String text) {
        this.document = document;
        this.text = text;
    }

    @Override
    public void execute() {
        document.append(text);
    }

    @Override
    public void undo() {
        for (int i = 0; i < text.length(); i++) {
            document.delete();
        }
    }
}
