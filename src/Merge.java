/**
 * @author abs
 * @Date 2019/8/11 - 23:11
 */
public class Merge {
    public static void main(String[] args) {

    }
    public static ListNode3 merge(ListNode3 list1,ListNode3 list2){
        ListNode3 result = new ListNode3(0);
        ListNode3 temp = result;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }else {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }
        while (list1 != null){
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }
        while (list2 != null){
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }
        return result.next;
    }
}
