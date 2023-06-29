package BookTest;

import Book.BookMgr;
import Book.AbstractionBook;

import java.util.AbstractList;

public class BookMgr_Test {
    public static void main(String[] args) {
        Test();
    }

    static void Test(){
        BookMgr mgr = new BookMgr();
        mgr.add(new AbstractionBook(1,"eee","xy"));
        mgr.add(new AbstractionBook(2,"eee","xy"));

        System.out.println(mgr.count());
    }
}
