package Book;

import java.util.ArrayList;

public class Author
{
    private String AutherName;
//Authors have book
    private ArrayList<Book> book;

    public Author(String name,ArrayList<Book> book)
    {
        this.AutherName = name;
        this.book =book;
    }
    public String getName()
    {

        return AutherName;
    }

    public void setAuthorName(String autherName)
    {
        AutherName = autherName;
    }

    public ArrayList<Book> getBook()
    {
        return book;
    }
}
