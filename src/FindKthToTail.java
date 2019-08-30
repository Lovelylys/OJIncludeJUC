/**
 * @author abs
 * @Date 2019/8/10 - 16:03
 */
public class FindKthToTail {
    public static void main(String[] args) {

    }
    public static ListNode3 findKthToTail(ListNode3 head, int k){
        if(head == null){
            return null;
        }
        int count = 0;
        ListNode3 temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        if(k > count || k <=0){
            return null;
        }
        for (int i = 0; i < count - k; i++) {
            head = head.next;
        }
        return head;
    }
}
class ListNode{
    int val;
    ListNode3 next = null;

    ListNode(int val) {
        this.val = val;
    }
}
