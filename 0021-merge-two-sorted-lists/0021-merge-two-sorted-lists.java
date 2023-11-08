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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode lastNode = dummy;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                lastNode.next = list1;
                list1 = list1.next;
            } else {
                lastNode.next = list2;
                list2 = list2.next;
            }
            lastNode = lastNode.next;
        }
        //After the loop, if either list1 or list2 still has remaining nodes
        if(list1 != null) {
            lastNode.next = list1;
        } else {
            lastNode.next = list2;
        }
        //return head of node
        return dummy.next;
    }
}