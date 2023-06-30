package Pages;

import Book.BookMgr;
import KeyBoardInput.Input;
import Pages.subPage.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PageFlow {

    BookMgr bookMgr;
    String filePath;
    HomePage homePage;
    ShowPage showPage;
    AddPage addPage;
    RemovePage removePage;
    ExitPage exitPage;
    public PageFlow(){
        filePath = "";
    }
    public PageFlow(String path){
        filePath = path;
    }

    public void start(){
        //加载文件
        load(filePath);

        //显示提示

        while (true){


            //显示主页
            if(null == homePage){
                homePage = new HomePage();
            }
            homePage.show();

            //获取输入
            while(!keyPress()){
                System.out.println("输入信息无匹配项，请重新输入");
            }

            //跳转子页面
                //获取输入

            //退出子页面

            if(null != exitPage){
                if(exitPage.afterExit){
                    break;
                }
            }
        }
        //处理缓存
    }

    void load(String filePath){
        if(filePath.isEmpty()){
            bookMgr = new BookMgr();
            return;
        }

        try {
            bookMgr = new BookMgr();
            Path path = Paths.get(filePath);
            String read = Files.readAllLines(path).get(0);
        }catch (IOException e){
            System.out.println("读取错误");
            bookMgr.clear();
        }
    }

    boolean keyPress(){
        int data = Input.getInt();

        switch (data) {
            case 1 ->{
                if(null == showPage){
                    showPage = new ShowPage(bookMgr);
                }
                showPage.show();
            }
            case 2 ->{
                if(null == removePage){
                    removePage = new RemovePage();
                }
                removePage.show();
            }
            case 3 ->{
                if(null == addPage){
                    addPage = new AddPage();
                }
                addPage.show();
            }
            case 4->{
                if(null== exitPage){
                    exitPage = new ExitPage();
                }
                exitPage.show();
            }
            default -> {
                return false;
            }
        }
        return true;
    }
}
