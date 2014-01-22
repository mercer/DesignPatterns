package io.mercer.dp.decorator;

public class HardCover extends BookDecorator {
    public HardCover(Book decoratedBook) {
        super(decoratedBook);
    }

    @Override
    public String getTraits() {
        return super.getTraits() + " with hard cover";
    }
}
