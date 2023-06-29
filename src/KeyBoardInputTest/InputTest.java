package KeyBoardInputTest;

import java.util.InputMismatchException;
import java.util.Scanner;


public class InputTest {
    public static void main(String[] args) {


        System.out.println("请输入一个整形数字，按回车键结束");
        int text = -1;


        boolean isOk = false;

        while(!isOk){
            try {
                Scanner scanner = new Scanner(System.in);
                text = scanner.nextInt();
                isOk = true;
            }catch (InputMismatchException in){
                System.out.println("err：输入内容出现预期之外的值,请重新输入");
            }
        }

        System.out.println("输入字符："+text);
    }
}
