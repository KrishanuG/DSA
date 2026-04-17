// Last updated: 4/17/2026, 4:05:32 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverseList(ListNode head) {
13        // 1->2->3->4->5->null
14        //5->4->3->2->1->null
15        ListNode curr = head;
16        ListNode prev = null;
17
18        while (curr != null) {
19            ListNode temp = curr.next;
20            curr.next = prev;
21            prev = curr;
22            curr = temp;
23        }
24        return prev;
25    }
26}