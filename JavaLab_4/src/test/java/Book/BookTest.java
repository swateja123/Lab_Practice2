package Book;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;
@Before

public void setup()
{
   book =new Book("Flickan som lekte med elden",1974.0,3.6);
    System.out.println("Test Cases Exicution");
}
    @Test
    public void setTitle()
    {
        String title = book.getTitle();
        assertEquals(title,book.getTitle());
    }

    @Test
    public void setYear()
    {
        Double year = book.getYear();
        assertEquals(Optional.of(year), Optional.of(book.getYear()));
    }

    @Test
    public void setRating()
    {
        Double rate = book.getRating();
        assertEquals(Optional.of(rate),Optional.of(book.getRating()));
    }

    @Test
    public void getTitle()
    {
        String title = book.getTitle();
        assertEquals(title,book.getTitle());
    }

    @Test
    public void getYear()
    {
        Double year = book.getYear();
        assertEquals(Optional.of(year),Optional.of(book.getYear()));
    }

    @Test
    public void getRating()
    {
        Double rate = book.getRating();
        assertEquals(Optional.of(rate),Optional.of(book.getRating()));
        System.out.println("All test cases Executed Successfully");
    }
}