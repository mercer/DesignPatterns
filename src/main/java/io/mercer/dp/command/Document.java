package io.mercer.dp.command;

public class Document {
    private StringBuilder content = new StringBuilder();

    public void append(String text) {
        content.append(text);
    }

    public void delete() {
        content.delete(content.length() - 1, content.length());
    }

    public String getContent() {
        return content.toString();
    }

}
