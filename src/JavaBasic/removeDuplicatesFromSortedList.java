package JavaBasic;

public class removeDuplicatesFromSortedList {
/*Given a sorted linked list, delete all duplicates such that each element 
 * appear only once.
For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
*/
	// Definition for ListNode
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
