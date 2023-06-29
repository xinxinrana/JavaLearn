package Pages;

import Book.BookMgr;
import KeyBoardInput.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PageFlow {

    BookMgr bookMgr;

    public PageFlow(){
        //加载文件

        //显示提示

        while (true){


            //显示主页

            //获取输入
            break;

            //跳转子页面
                //获取输入

            //退出子页面

        }
    }

    void load(String filePath){
        if(filePath.isEmpty()){
            bookMgr = new BookMgr();
            return;
        }

        try {
            Path path = Paths.get(filePath);
            String read = Files.readAllLines(path).get(0);
        }catch (IOException e){
            System.out.println("读取错误");
            bookMgr.clear();
        }
    }

    void keyPress(){
        int data = Input.getInt();

        switch (data) {
            case 1 ->{

            }
            default -> {

            }
        }
    }
}
