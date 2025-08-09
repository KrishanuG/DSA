// Last updated: 8/9/2025, 2:54:42 PM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Floyd's cycle Detection (Tortoise & Hare)
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }
        return false;
    }
}
/*
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Using HashMap
        HashMap<ListNode, Boolean> visited = new HashMap<>();
        ListNode current = head;
        while (current != null) {
            if (visited.containsKey(current)) {
                return true;
            }
            visited.put(current, true);
            current = current.next;
        }
        return false;
    }
} */