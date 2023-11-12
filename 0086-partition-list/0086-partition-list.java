/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        //create two new instances of listnode with value 0
        ListNode low = new ListNode(0);
        ListNode high = new ListNode(0);
        //declare two new variables refer to low and high
        ListNode lowHead = low, highHead = high;

        while(head != null) {
            if(head.val < x ) {
                lowHead.next = head;
                lowHead = lowHead.next;
            } else {
                highHead.next = head;
                highHead = highHead.next;
            }
            head = head.next;
        }
        highHead.next = null;
        lowHead.next = high.next;
        return low.next;
    }
}