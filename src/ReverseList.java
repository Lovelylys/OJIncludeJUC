import java.util.Stack;

/**
 * @author abs
 * @Date 2019/8/11 - 22:53
 */
public class ReverseList {
    public static void main(String[] args) {

    }

    public ListNode3 reverseList(ListNode3 head) {
        int len = 0;
        ListNode3 temp = head;
        ListNode3 next = null;
        ListNode3 reverse = new ListNode3(0);
        while (temp != null){
            next = temp.next;
            temp.next = reverse.next;
            reverse.next = temp;

            temp = next;
        }
        return reverse.next;
    }
}

class ListNode3 {
    int val;
    ListNode3 next = null;

    ListNode3(int val) {
        this.val = val;
    }
}