package Book;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AuthorTest {
    Author author;
    ArrayList<Book> book1 = null;


    @Test
    public void getName()
    {
        System.out.println("Start the exicution of Test");
        author =new Author("Suzanne Collins",book1);
        String Name = author.getName();
        assertEquals(Name,Name);
    }

}