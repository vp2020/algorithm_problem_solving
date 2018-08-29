// Leetcode 2. Add Two Numbers

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        int num = 0;
        ListNode head = new ListNode(0);
        ListNode current = head;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                sum = carry + l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if (l1 != null && l2 == null) {
                sum = carry + l1.val;
                l1 = l1.next;
            }
            else if (l1 == null && l2 != null) {
                sum = carry + l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            num = sum % 10;
            ListNode newNode = new ListNode(num);
            current.next = newNode;
            current = newNode;
        }
        if (carry != 0) {
            ListNode node = new ListNode(carry);
            current.next = node;
            current = node;
        }
        return head.next;
    }
}
