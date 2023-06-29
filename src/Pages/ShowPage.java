package Pages;

import Book.AbstractionBook;
import Book.BookMgr;

import java.util.ArrayList;

public class ShowPage implements Page{
    private BookMgr mgr = null;

    public ShowPage(BookMgr aMgr){
        mgr = aMgr;
    }
    @Override
    public void show() {
        if(mgr == null){
            System.out.println("err:加载数据出现问题");
        }

        for(AbstractionBook aBook:mgr.data()){
            showOneBook(aBook);
        }
    }

    void showOneBook(AbstractionBook aBook){
        System.out.println(PageModule.separator());
        System.out.println(String.format("书名：《%s》  作者：%s",aBook.getName(),aBook.getAuthor()));
        System.out.println(String.format("这本书的唯一编号是：%d ",aBook.getId()));
        System.out.println(PageModule.separator());
    }

    public BookMgr getMgr() {
        return mgr;
    }

    public void setMgr(BookMgr mgr) {
        this.mgr = mgr;
    }
}
