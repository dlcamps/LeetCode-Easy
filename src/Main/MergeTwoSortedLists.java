package Main;

public class MergeTwoSortedLists {

    ListNode testNode3 = new ListNode(4);
    ListNode testNode4 = new ListNode(3);
    ListNode testNode1 = new ListNode(1, testNode3);
    ListNode testNode2 = new ListNode(2, testNode4);

    public static void main(String[] args) {
        new MergeTwoSortedLists();
    }

    public MergeTwoSortedLists() {
        mergeTwoLists(testNode1, testNode2);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode startNode = new ListNode();
        ListNode indexNode = new ListNode();
        startNode.next = indexNode;

        while (l1.next != null || l2.next != null) {
            ListNode tempNode = new ListNode();
            if (l1.next != null ^ l2.next != null) {
                if (l1.next == null) {
                    tempNode.val = l2.val;
                    break;
                } else {
                    tempNode.val = l1.val;
                    break;
                }
            }
            if (l1.val > l2.val) {
                tempNode.val = l1.val;
                l1 = l1.next;
            } else {
                tempNode.val = l2.val;
                l2 = l2.next;
            }
            indexNode.next = tempNode;
            indexNode = tempNode;
        }
        System.out.println(startNode.next.toString());
        return startNode.next;
    }
}
