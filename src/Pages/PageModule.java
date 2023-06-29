package Pages;

public class PageModule {

    public static String separator(){
        return separator(40,'-');
    }
    public static String separator(int count,char aChar){
        return repeat(String.valueOf(aChar),count);
    }


    static String repeat(final String str, final int n) {
        final int len = (str == null) ? 0 : str.length();
        if (len < 1 || n < 1) {
            return "";
        }
        final StringBuilder sb = new StringBuilder(len * n);
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
