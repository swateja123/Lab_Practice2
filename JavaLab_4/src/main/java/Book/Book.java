package Book;

import java.util.ArrayList;
import java.util.Comparator;

public class Book {
    private String title;
    private double year;
    private double rating;
    private Author author;
    ArrayList<String> BookAuthor=new ArrayList<String>();

    public Book()
    {
        String title="";
        double year=0;
        double rating=0.0;
        String Name=" ";
    }


//Constructor Calling
    public Book(String title, double year, double rating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.author = author;

    }

    public void setBookAuthor(ArrayList<String> bookauthor)
    {
        BookAuthor = bookauthor;
    }

    public ArrayList<String> getAuthorName1()
    {
        return BookAuthor;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setYear(double year)
    {
        this.year = year;
    }

    public void setRating(double rating)
    {
        this.rating = rating;
    }

    public String getTitle()
    {
        return title;
    }

    public double getYear()
    {
        return year;
    }

    public double getRating()
    {
        return rating;
    }

}
class SortbyRating implements Comparator<Book>
{
    //Sort the book by ascending order of ratings
    public int compare(Book a, Book b)
    {
        return  Double.compare(a.getRating(), b.getRating());
    }
}

//Implementation of Comparator for
//sort by rating,year,name

class Sortbyname implements Comparator<Book> {
    //Sort the book by ascending order of Title
    public int compare(Book a, Book b)
    {

        return a.getTitle().compareToIgnoreCase(b.getTitle());
    }
}
class SortByYear implements Comparator<Book>
{
    //Sort the book by ascending order of year

    public int compare(Book a, Book b)
    {
        //return int data for year
        return (int) (a.getYear() - b.getYear());
    }
}