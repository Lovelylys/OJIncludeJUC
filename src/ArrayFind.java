/**
 * @author abs
 * @Date 2019/8/7 - 0:33
 */
public class ArrayFind {
    public static void main(String[] args) {

    }
    public boolean Find(int target, int [][] array) {
        int i = array.length-1;
        int j = 0;
        return findTarget(target,array,i,j);
    }
    public boolean findTarget(int target,int[][] array,int left,int right){
        if(left < 0 || right >= array[0].length){
            return false;
        }
        int mid = array[left][right];
        if(mid < target){
            return findTarget(target,array,left,right+1);
        }else if(mid > target){
            return findTarget(target,array,left-1,right);
        }else{
            return true;
        }
    }
}
