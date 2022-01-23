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
    public ListNode addTwoNumbers(ListNode listNode1, ListNode listNode2) {
        return addTwoNumber(listNode1, listNode2, 0);
    }

    public ListNode addTwoNumber(ListNode listNode1, ListNode listNode2, int extraNumber) {
        if (listNode1 == null && listNode2 == null && extraNumber == 0) {
            return null;
        }
        listNode1 = listNode1 == null ? new ListNode(0) : listNode1;
        listNode2 = listNode2 == null ? new ListNode(0) : listNode2;
        int value = listNode1.val + listNode2.val + extraNumber;
        return new ListNode(value >= 10 ? value - 10 : value, addTwoNumber(listNode1.next, listNode2.next, value >= 10 ? 1 : 0));
    }
}