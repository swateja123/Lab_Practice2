package Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public void PrintSortByTitle(ArrayList<Author> authorList) {
        System.out.println("-----------------Sort By Book Title-------------------------------------------");
        for (int i = 0; i < authorList.size(); i++) {
            Collections.sort(authorList.get(i).getBook(), new Sortbyname());

        }
        for (Author author1 : authorList) {
            System.out.println("Author = " + author1.getName());
            for (Book book1 : author1.getBook()) {
                System.out.println("Title  =  " + book1.getTitle());

            }
            System.out.println("________________________________________________");
        }
        System.out.println("-----------------------------------------------");
    }

        public void PrintSortByYear(ArrayList<Author> authorList)
        {
            System.out.println("-----------------Sorted By Year---------------------------- ");
            for (int i = 0; i < authorList.size(); i++) {
                Collections.sort(authorList.get(i).getBook(), new SortByYear());
            }
            for (Author author1 : authorList) {
                System.out.println("Author=" + author1.getName());
                for (Book book1 : author1.getBook()) {
                    System.out.println("Year = " + book1.getYear());

                }
                System.out.println("________________________________________________");
            }
            System.out.println("-------------------------------------------------------");

        }
        public void PrintSortByRatings(ArrayList<Author> authorList)
        {
            System.out.println("--------------------------Sorted By Rating--------------------------------");
            for (int i = 0; i < authorList.size(); i++) {
                Collections.sort(authorList.get(i).getBook(), new SortbyRating());
            }
            for (Author author1 : authorList) {
                System.out.println("Author= " + author1.getName());
                for (Book book1 : author1.getBook()) {
                    System.out.println("Ratings  = " + book1.getRating());

                }
                System.out.println("________________________________________________");
            }
            System.out.println("---------------------------------------------------");
        }
        public void bookAuthors(ArrayList<Author> authorList, Set<String> data)
        {
            System.out.println("-----------------Book Name And There Authers-------------------------");
            System.out.println("Enter Name Of the Book:");
            Scanner sc1 = new Scanner(System.in);
            String bookName = sc1.nextLine();
            data = new HashSet<>();
            for (Author author1 : authorList) {
                for (Book book1 : author1.getBook()) {
                    if (book1.getTitle().equals(bookName)) {
                        data.add(author1.getName());
                    }
                }
            }
            for (String AutherNametoprint : data) {
                System.out.println("Author = " + AutherNametoprint);
            }
        }
    public void Authorbooks(ArrayList<Author> authorList, Set<String> data)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name Of Author: ");
        sc = new Scanner(System.in);
        String an = sc.nextLine();
        data = new HashSet<>();
        for (Author author1 : authorList) {
            if (author1.getName().equals(an)) {
                for (Book book1 : author1.getBook()) {
                    data.add(book1.getTitle());
                }
            }
        }
        System.out.println(data.size() + " Books are Written By " + an);
    }
    public void YearBooks(ArrayList<Author> authorList)
    {
        System.out.println("Enter Year: ");
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        int year = sc.nextInt();
        Set<String> nameOfBook = new HashSet<>();
        for (Author author1 : authorList) {
            for (Book book1 : author1.getBook()) {
                if (book1.getYear() == year) {
                    nameOfBook.add(book1.getTitle());
                }
            }
        }
        System.out.println("Books written in " + year + " are:");
        for (String s : nameOfBook) {
            System.out.println(s);
        }
    }
    public void prolific(ArrayList<Author> authorList)
    {


        System.out.println("-----------Most prolific author--------------------");
        Map<String, Integer> bookCount = new HashMap<>();
        for (Author author1 : authorList) {
            int count = 0;
            for (Book book1 : author1.getBook()) {
                count++;
            }
            bookCount.put(author1.getName(), count);
        }
        Map<String, Integer> result = new LinkedHashMap<>();
        bookCount.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));

        Set<String> l = result.keySet();
        System.out.println("Most Prolific Author Name:" + l.iterator().next());
    }
    public static void main(String[] args)
    {
        Main m=new Main();
        //creating arraylist to store data from csv file

        ArrayList<String> authorName = new ArrayList<>();
        ArrayList<Author> authorList = new ArrayList<>();
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<String> BookName=new ArrayList<String>();
        ArrayList<String> AuthorName=new ArrayList<String>();

        //Create object of Class
        Author author;
        Book book;
        Set<String> data = null;
        //read file;
        String line = "";
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("E:\\New Learning\\JavaLab_4\\src\\main\\resources\\Books.csv"));
            int k=0;
            while ((line = br.readLine()) != null)
            {
                if(k == 0){
                    k++;
                    continue;
                }
                String BookDeatils[] = line.split(";");

                AuthorName.add(BookDeatils[6]);
                BookName.add(BookDeatils[8]);


                if (BookDeatils[6].contains(",")) {
                    String repetedName[] = BookDeatils[6].split(",");
                    for (int i = 0; i < repetedName.length; i++) {
                        authorName.add(repetedName[i]);
                        book = new Book(BookDeatils[8], Double.parseDouble(BookDeatils[7]), Double.parseDouble(BookDeatils[10]));
                        bookList.add(book);
                    }
                } else {
                    authorName.add(BookDeatils[6]);
                    book = new Book(BookDeatils[8], Double.parseDouble(BookDeatils[7]), Double.parseDouble(BookDeatils[10]));
                    bookList.add(book);
                }
            }
        } catch (
                IOException e)
        {
            e.printStackTrace();
        }

        HashMap<Author, ArrayList<Book>> map = new HashMap<>();
        ArrayList<Book> bookmap = null;
        for (int i = 0; i < authorName.size(); i++)
        {
            String newAuthor = authorName.get(i);
            bookmap = new ArrayList<Book>();
            for (int j = 0; j < authorName.size(); j++)
            {

                if (newAuthor.equals(authorName.get(j)))
                {
                    bookmap.add(bookList.get(j));
                }
            }
            author = new Author(newAuthor, bookmap);
            //add books author data to authorList
            authorList.add(author);
            map.put(author, bookmap);
        }

        int temp=1;
        Scanner sc=new Scanner(System.in);
        int ch;
        while(temp!=0)
        {
            System.out.println("------Amazing library!------------");
            System.out.println("List all books written by an author using following criteria: \n" +
                    "1. Print Books Title alphabetical , \n" +
                    "2. Print Books by publication date , \n" +
                    "3. Print Books  by rating asc/desc;\n" +
                    "4. Given a book, know who is the author / are the authors;\n" +
                    "5. How many books has an author written;\n" +
                    "6. Given a Date, what are the books written in that year;\n" +
                    "7. who is the most prolific author?\n"+
                    "8. Exit");
            System.out.println("Enter choice");
             ch=sc.nextInt();
            switch (ch) {
                case 1:
                m.PrintSortByTitle(authorList);
                break;
                case 2:
                m.PrintSortByYear(authorList);
                break;
                case 3:
                m.PrintSortByRatings(authorList);
                break;
                case 4:
                m.bookAuthors(authorList, data);
                break;
                case 5:
                m.Authorbooks(authorList, data);
                break;
                case 6:
                m.YearBooks(authorList);
                break;
                case 7:
                m.prolific(authorList);
                break;
                case 8:
                    temp=0;
                    break;

                default:
                    System.out.println("Please enter correct choice");
                    break;


            }
        }
        System.out.println("Thank You");
    }
}
