package com.leetCode;

//LeetCode 142 环装链表
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        do {
            if (fast == null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        } while (slow != fast);

        ListNode begin = head;
        while (slow != begin) {
            slow = slow.next;
            begin = begin.next;
        }
        return begin;
    }
}
