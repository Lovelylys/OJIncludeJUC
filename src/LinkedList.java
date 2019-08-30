import java.util.ArrayList;
import java.util.Stack;

/**
 * @author abs
 * @Date 2019/8/7 - 0:24
 */
public class LinkedList {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode3 listNode) {
        ListNode3 temp = listNode;
        ArrayList<Integer> list = new ArrayList<>();
        Stack<ListNode3> stack = new Stack<>();
        while(temp != null){
            stack.push(temp);
            temp = temp.next;
        }
        while(!stack.isEmpty()){
            list.add(stack.pop().val);
        }
        return list;
    }
}

class ListNode2{
    int val;
    ListNode3 next = null;

    ListNode2(int val) {
        this.val = val;
    }
}