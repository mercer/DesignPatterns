package io.mercer.dp.decorator;

public class LeatherBound extends BookDecorator {
    public LeatherBound(Book decoratedBook) {
        super(decoratedBook);
    }

    @Override
    public String getTraits() {
        return super.getTraits() + " with leather bound";
    }

}
