// Last updated: 8/9/2025, 10:01:05 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        //boundary check
        if (a == null || b == null)
            return null;
        // Keep going until both pointers meet Or until we're sure they won't meet.
        while (a != b) {
            if (a == null) // If pointer A reaches the end of its track
            {
                a = headB; // it starts running on track B! It's like saying, "Okay, let's see if we can meet if I run the other way".
            } else {
                a = a.next; // Otherwise, pointer A continues to the next node on its track. Just keep running!
            }
            // same logic for pointer b
            if (b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }
        return a;
    }
}
