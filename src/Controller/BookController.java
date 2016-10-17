package Controller;
import DTOobjects.Book;
import ServiveImplementation.ServiceImplementation;
import java.util.ArrayList;

import static com.sun.tools.doclets.formats.html.markup.HtmlStyle.title;
import com.sun.deploy.uitoolkit.Window;
import java.util.ArrayList;
import java.util.Scanner;

public class BookController {


    Scanner input = new Scanner(System.in);
    Book book = new Book();
    ServiceImplementation serviceImpl = new ServiceImplementation();



    public void getBooks() {
        ArrayList<Book> books = serviceImpl.getBooks();
        return books;
    }

    public String createBook(int ISBN, String title, String edition, String author) {

   if (ISBN==10) {
       return "ISBN has to be 10 digits";
   }

   if (title.contains("")){
       return "Title cannot be blank";
   }

   if (edition.contains("")){
       return "Edition cannot be blank";
   }

   if (author.contains("")){
       return "Author cannot be blank";
   }

   Book book = new Book (0, ISBN, title, edition, author);

        //gem i database??

   return "OK";

    }



    public void deleteBook() {


        }

    public void showBook(int i) {
        return books.get(i);

        }

    public void test() {


    }


}
