package Practice.JavaSE8.lambda;

import java.awt.print.Book;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BooksService {

    public List<BookEO> getBooksList()
    {
        List<BookEO> books = new BookDAO().BooksDetails();
        Collections.sort(books,  (BookEO b1, BookEO b2)->b2.getBookName().compareTo(b1.getBookName()));
        return  books;
    }

    public static  void main(String [] args)
    {
        System.out.println(new BooksService().getBooksList());
    }


//    class MyComparator implements Comparator<BookEO>
//    {
//        @Override
//        public int compare(BookEO o1, BookEO o2) {
//        return o1.getBookName().compareTo(o2.getBookName());
//    }
//    }
}
