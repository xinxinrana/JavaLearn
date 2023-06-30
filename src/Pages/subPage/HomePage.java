package Pages.subPage;

import Pages.PageModule;

public class HomePage implements Page {
    @Override
    public void show(){
        System.out.println(PageModule.separator());
        System.out.println("1.查看图书目录");
        System.out.println("2.删除图书");
        System.out.println("3.增加图书");
        System.out.println("4.退出系统");
        System.out.println(PageModule.separator());
    }
}
