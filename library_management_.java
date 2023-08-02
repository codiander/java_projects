package learning;
/* BOOK NAME
    BOOK AUTHOR
    ISSUED TO
    ISSUED ON
     */

import java.util.ArrayList;

class Books{
    public String book_name;



    public Books(String book_name, String book_author) {
        this.book_name = book_name;
        this.book_author = book_author;
    }

    public String book_author;
    public String _issued_to;
    public String issued_on;

    @Override
    public String toString() {
        return book_name+" is written by "+book_author;
    }
}

class library{
    public ArrayList<Books> books;
    public library(ArrayList<Books>books){
        this.books = books;
    }

    public void add_book(Books added_book){
        this.books.add(added_book);
    }
    public void issued_books(Books issued_book){
        this.books.remove(issued_book);
    }

    public void return_book(Books returned_book){
        this.books.add(returned_book);
    }


}



public class library_management_ {
    public static void main(String[] args) {

        ArrayList <Books> bk = new ArrayList<>();
    library lib = new library(bk);
    lib.add_book(new Books("POWER OF HABITS.","CHARLES DUHIGG"));
        lib.add_book(new Books("THE CHRONICLES OF NARNIA.","C.N. LEWIS"));
        lib.add_book(new Books("HOW TO WIN FRIENDS AND INFLUENCE PEOPLE.","DALE CARNIEGE"));
        lib.add_book(new Books("SAPIENS.","YUVAL NOAH HARARI"));

        for (Books b: bk
             ) {
            System.out.println(b);

        }

    }
}
