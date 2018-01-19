package commands;

import model.Book;

public class AddBookCommand implements ClientCommand {
    @Override
    public void execute() {
        Book book = new Book();
        client.addNewBook(book);
    }
}
