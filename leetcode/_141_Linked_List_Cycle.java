import java.util.HashSet;
import java.util.Set;
 
public class _141_Linked_List_Cycle {
    
    public static boolean hasCycle(ListNode head) {
        if ( head == null || head.next== null){
            return false;
        }
       
        Set<ListNode> mySet = new HashSet<>();
        while (head != null) {
            
            if (mySet.contains(head)) {
                return true;
            } else {
                mySet.add(head);
            }
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        // n4.next = n2;
        System.out.println(hasCycle(head));
}

}
