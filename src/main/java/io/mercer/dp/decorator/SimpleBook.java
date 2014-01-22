package io.mercer.dp.decorator;

public class SimpleBook extends Book {
    @Override
    public String getDescription() {
        return "book";
    }

    @Override
    public String getTraits() {
        return "book";
    }
}
