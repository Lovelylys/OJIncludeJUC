/**
 * @author abs
 * @Date 2019/8/7 - 0:20
 */
public class StringReplace {
    public static void main(String[] args) {
        String str = replaceSpace(new StringBuffer("we are happy"));
        System.out.println(str);
    }
    public static String replaceSpace(StringBuffer str){
        String result = str.toString().replaceAll(" ","%20");
        return result;
    }
}
