import org.w3c.dom.Node;

public class _21_Merge_Two_Sorted_Lists {
    public static ListNode mergeTwoLists(ListNode n1, ListNode l1) {
        if (n1 == null) {
            return l1;
        }
        if (l1 == null) {
            return n1;
        }
        ListNode head = null;
        ListNode temp = null;
        while (n1 != null && l1 != null) {
              if (n1.val <= l1.val) {
                  if (head == null) {
                    head = n1;
                    temp = n1;
                    n1 = n1.next;
                }else{
                    temp.next = n1;
                    temp = n1;
                    n1 = n1.next;
                }
            } else {
                if (head == null) {
                    head = l1;
                    temp = l1;
                    l1 = l1.next;
                } else {
                    temp.next = l1;
                    temp = l1;
                    l1 = l1.next;
                }
            }
         if (n1 == null) {
             temp.next = l1;
         }else if (l1 == null){
             temp.next = n1;
         }
         }
        
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);
        ListNode l1 = new ListNode(1);
       ListNode l2 = new ListNode(3);
       ListNode l3 = new ListNode(4);
       n1.next = n2;
       n2.next = n3;
       l1.next = l2;
       l2.next = l3;
       System.out.println(mergeTwoLists(n1, l1));
    }
}
