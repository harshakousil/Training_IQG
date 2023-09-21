package Practice.JavaSE8.lambda;

import java.awt.print.Book;

public class BookEO {

    private int bookid;


    private String bookName;

    private String authorName;

    private int cost;


    public BookEO()
    {

    }
    public BookEO(int bookid, String bookName, String authorName, int cost)
    {
        this.bookid=bookid;
        this.bookName=bookName;
        this.authorName=authorName;
        this.cost=cost;

    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authname) {
        authorName = authname;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "BookEO{" +
                "bookid=" + bookid +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
