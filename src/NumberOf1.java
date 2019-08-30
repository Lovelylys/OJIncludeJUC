/**
 * @author abs
 * @Date 2019/8/9 - 22:24
 */
public class NumberOf1 {
    public static void main(String[] args) {
        System.out.println(NumberOf1(-1));
    }
    public static int NumberOf1(int n){
        String in = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < in.length(); i++) {
            if(in.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}
