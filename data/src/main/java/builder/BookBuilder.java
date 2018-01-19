package builder;

import model.Book;
import model.Genre;
import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.util.Scanner;

public class BookBuilder {
    private final static Logger LOG = Logger.getLogger(BookBuilder.class);
    private Book book = new Book();
    private Scanner scanner = new Scanner(System.in);
    private Class bookClass = Book.class;

    private Genre selectGenre(){
        LOG.info("select book genre:");
        int iteration = 1;
        for(Genre gen: Genre.values()){
            System.out.println(String.format("%d: %s",iteration,gen));
            iteration++;
        }
        String value = scanner.nextLine();
        switch (value) {
            case "1":
                book.setGenre(Genre.COMEDY);
                break;
            case "2":
                book.setGenre(Genre.FANTASY);
                break;
            case "3":
                book.setGenre(Genre.HORROR);
                break;
            case "4":
                book.setGenre(Genre.ROMANCE);
                break;
            default:
                LOG.info("You have been input illegal value, please input correct value");
                selectGenre();
                break;
        }
        return book.getGenre();
    }

    public Book buildBook(){
        Book book = new Book();
        Field[] fields = bookClass.getDeclaredFields();
        try {
            for (Field fld : fields) {
                fld.setAccessible(true);
                if (!fld.getName().equals("genre")) {
                    LOG.info(String.format("input %s value", fld.getName()));
                    String value = scanner.nextLine();
                    fld.set(book, value);
                } else
                    fld.set(book, selectGenre());
            }
        }catch (IllegalAccessException e) {
            e.printStackTrace();
            LOG.error("We have problem with book building");
        }
        return book;
    }
}
