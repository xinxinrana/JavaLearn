package Book;

import java.awt.print.Book;
import java.util.ArrayList;
import Book.AbstractionBook;

public class BookMgr {
    ArrayList<AbstractionBook> books = new ArrayList<AbstractionBook>();

    public boolean add(AbstractionBook aBook){
        if(have(aBook)){
            return false;
        }

        return books.add(aBook);
    }

    public boolean delete(AbstractionBook aBook){
        return books.remove(aBook);
    }

    public boolean update(AbstractionBook aBook){
        int id = aBook.getId();
        boolean isHave = false;

        for (int index = 0;index < books.size();index++) {
            if(books.get(index).getId() == id){
                isHave = true;
                books.set(index,aBook);
                break;
            }
        }

        return isHave;
    }

    public boolean have(AbstractionBook aBook){
        int id = aBook.getId();
        boolean isHave = false;

        for (AbstractionBook book : books) {
            if(book.getId() == id){
                isHave = true;
                break;
            }
        }

        return isHave;
    }

    public int count(){
        return books.size();
    }

    public void clear(){
        books.clear();
    }

    public ArrayList<AbstractionBook> data(){
        return books;
    }

}
