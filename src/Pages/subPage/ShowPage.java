package Pages.subPage;

import Book.AbstractionBook;
import Book.BookMgr;
import Pages.PageModule;

public class ShowPage implements Page {
    private BookMgr mgr;

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
        System.out.printf("书名：《%s》  作者：%s",aBook.getName(),aBook.getAuthor());
        System.out.printf("这本书的唯一编号是：%d ",aBook.getId());
        System.out.println(PageModule.separator());
    }

    public BookMgr getMgr() {
        return mgr;
    }

    public void setMgr(BookMgr mgr) {
        this.mgr = mgr;
    }
}
