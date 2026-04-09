// Last updated: 4/9/2026, 1:44:02 PM
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
14        HashSet<ListNode> visited = new HashSet<>();
15        ListNode current = head;
16        Integer pos = 0;
17        while (current != null) {
18            if (visited.contains(current)) {
19                return current;
20            }
21            visited.add(current);
22            current = current.next;
23        }
24        return null;
25    }
26
27}