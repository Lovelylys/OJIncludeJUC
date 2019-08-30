/**
 * @author abs
 * @Date 2019/8/10 - 8:19
 */
public class ReOrderArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        reOrderArray(array);
    }
    public static void reOrderArray(int[] array){
        int len = array.length;
        int[] oddArray = new int[len];
        int[] evenArray = new int[len];
        int index2 = 0;
        int index = 0;
        int oddCount = 0;
        for (int i = 0; i < len; i++) {
            if(array[i]%2 != 0){
                oddArray[index++] = array[i];
                oddCount++;
            }else {
                evenArray[index2++] = array[i];
            }
        }
        for (int i = 0; i < oddCount; i++) {
            array[i] = oddArray[i];
        }
        for (int i = oddCount,j=0; i < len; i++,j++) {
            array[i] = evenArray[j];
        }
    }
}

