
// 876. Middle of the Linked List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        temp = head;
        int sizeby2 = size / 2;

        for (int i = 0; i < sizeby2; i++) {
            temp = temp.next;
        }
        return temp;

    }
}

// TC-> O(n) and SC -> O(1)