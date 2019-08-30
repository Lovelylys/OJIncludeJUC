import java.util.ArrayList;

/**
 * 用dfs解决挑台阶
 * 设置第一次为1或者2；遍历所有可以走的选项，
 * 然后将n - i，同等与已经访问的意思
 * 找出下一个能走的方式，
 * 遍历所有的方式，如果当前方式未访问，这里其实不需要判断了，
 * dfs遍历之，同时计数
 *
 * @author abs
 * @Date 2019/8/9 - 0:04
 */
public class JumpFloor {
    static int count = 0;
    static int result = 0;
    public static void main(String[] args) {
        System.out.println(jumpFloor(3));
        System.out.println(jumpFloor3(4));
    }

    public static int jumpFloor(int target) {
        ArrayList<Integer> list = next(target);
        if(target == 0){
            count++;
        }
        while(!list.isEmpty()){
            int step = list.remove(0);
            jumpFloor(target - step);
        }
        return count;
    }

    public static ArrayList<Integer> next(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        if (n - 1 >= 0) {
            list.add(1);
        }
        if (n - 2 >= 0){
            list.add(2);
        }
        return list;
    }

    /*
    斐波那契数列应用，尾递归，每次只剩1，2步台阶，假如6 = 5 + 4 ，6步就是5步的计算次数加上一步
    和四步的次数加上两步，所以是其两者的次数和
     */
    public static int jumpFloor2(int target){
        if(target <= 2){
            return target;
        }else{
            return jumpFloor2(target-1) + jumpFloor2(target-2);
        }
    }

    public static int jumpFloor3(int target){
        if(target <= 2){
            return target;
        }else{
            for (int i = 1; i < target; i++) {
                result += jumpFloor3(target-i);
            }
            return result+1;
        }
    }
}
