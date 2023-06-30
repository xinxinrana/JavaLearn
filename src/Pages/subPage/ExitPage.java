package Pages.subPage;

import Pages.PageModule;



public class ExitPage implements Page {
    public boolean afterExit = false;
    @Override
    public void show() {

        PageModule.clearConsole();


//        new PageModule.CLS();
        System.out.println("关闭程序");
        // 最好不要在程序子模块中关闭程序，应该在最外层的逻辑代码中关闭程序
//        System.exit(0);

        afterExit = true;
    }
}
