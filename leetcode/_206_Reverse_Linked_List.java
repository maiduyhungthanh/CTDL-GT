public class _206_Reverse_Linked_List {
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode cur = head;
        ListNode pre = cur.next;
        while (cur.next != null) {
            cur.next = pre.next;
            pre.next = head;
            head = pre;
            pre = cur.next;
        }
        return head;
    }
    public static void main(String[] args) {
         ListNode head = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        
        System.out.println(reverseList(head).val);
    }
}
