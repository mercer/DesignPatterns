package io.mercer.dp.decorator;

public class BookDecorator extends Book {
    private Book decoratedBook;
    public BookDecorator(Book decoratedBook){
        this.decoratedBook = decoratedBook;
    }

    @Override
    public String getDescription() {
        return decoratedBook.getDescription();
    }

    @Override
    public String getTraits() {
        return decoratedBook.getTraits();
    }
}
