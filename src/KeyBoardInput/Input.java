package KeyBoardInput;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Input {
    public Input(){

    }

    public static int getInt() {
        return getInt(true);
    }

    public static int getInt(boolean isPrintTips){
        String tip1 = "请输入一个整形数字，按回车键结束";
        String tip2 = "err：输入内容出现预期之外的值,请重新输入";
        if(!isPrintTips){
            tip1 = "";
            tip2 = "";
        }


        System.out.println(tip1);
        int text = -1;


        boolean isOk = false;

        while(!isOk){
            try {
                Scanner scanner = new Scanner(System.in);
                text = scanner.nextInt();
                isOk = true;
            }catch (InputMismatchException in){
                System.out.println(tip2);
            }
        }

        return text;

    }
}
