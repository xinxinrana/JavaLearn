package BookTest;

import Book.AbstractionBook;

public class AbstractionBook_Test {
    public static void main(String[] args) {
        Test();
    }
    static void Test(){
        AbstractionBook book = new AbstractionBook(1,"中文书籍","无名氏");

        System.out.println(book.Introduce());
    }
}
