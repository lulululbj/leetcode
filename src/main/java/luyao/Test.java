package luyao;

/**
 * Created by luyao
 * on 2017/9/20 13:36
 */
public class Test {

    public static void main(String[] args) {

        String str = "str";
        String newStr=appendStr(str);
//        str += "123";
        System.out.println(str);



    }

    public static String appendStr(String s) {
        s += "123";
        return s;
    }
}
