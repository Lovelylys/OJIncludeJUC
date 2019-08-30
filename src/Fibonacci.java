/**
 * @author abs
 * @Date 2019/8/8 - 23:56
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }else if(n <= 2){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
