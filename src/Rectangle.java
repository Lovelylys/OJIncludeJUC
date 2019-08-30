import com.sun.org.apache.regexp.internal.RE;

/**
 * @author abs
 * @Date 2019/8/9 - 21:56
 */
public class Rectangle {
    public static void main(String[] args) {
    }
    public int RectCover(int target) {
        if(target <= 3){
            return target;
        }else {
            return RectCover(target-1) + RectCover(target-2);
        }
    }
}
