// Last updated: 4/9/2026, 1:58:21 PM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        if (head == null) return null;
15        ListNode slow = head;
16        ListNode fast = head;
17
18        // Step 1: Detect cycle
19        while (fast != null && fast.next != null) {
20            slow = slow.next;
21            fast = fast.next.next;
22
23            if (slow == fast) {
24                // Step 2: Find cycle start
25                ListNode ptr = head;
26                while (ptr != slow) {
27                    ptr = ptr.next;
28                    slow = slow.next;
29                }
30                return ptr;
31            }
32        }
33        return null;
34    }
35}
36
37/*
38public class Solution {
39    public ListNode detectCycle(ListNode head) {
40        HashSet<ListNode> visited = new HashSet<>();
41        ListNode current = head;
42        Integer pos = 0;
43        while (current != null) {
44            if (visited.contains(current)) {
45                return current;
46            }
47            visited.add(current);
48            current = current.next;
49        }
50        return null;
51    }
52}*/
53