package io.mercer.dp.command;

public class DeleteOneCharacter implements Command {
    private Document document;
    private String deleted;

    public DeleteOneCharacter(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        deleted = document.getContent().substring(document.getContent().length() - 1, document.getContent().length());
        document.delete();
    }

    @Override
    public void undo() {
        document.append(deleted);
    }
}
