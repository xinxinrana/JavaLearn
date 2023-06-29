package Pages;

public class PageModule {

    public static String separator(){
        return separator(40,'-');
    }
    public static String separator(int count,char aChar){
        return repeat(String.valueOf(aChar),count);
    }


    static String repeat(final String str, final int n) {
        return str.repeat(n);
    }
}
