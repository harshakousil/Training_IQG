package Practice.JavaSE8.lambda;

import java.util.ArrayList;
import java.util.List;
public class BookDAO {

  public  List<BookEO>  BooksDetails()
  {
       List<BookEO> books =new ArrayList<>();

       books.add(new BookEO(1,"Java SE","Rohit Sharma",700));
      books.add(new BookEO(2,"Java EE","Subhman Gill",500));
      books.add(new BookEO(6,"Mongo DB","Virat Kohli",600));
      books.add(new BookEO(4,"React Js","KL rahul",800));
      books.add(new BookEO(3,"SQL","Ishan Kishan",100));
      books.add(new BookEO(5,"Html and css","hardik pandya",400));
      books.add(new BookEO(7,"Rest Full API's","Shardhul Thakur",200));

      return books;
  }
}
