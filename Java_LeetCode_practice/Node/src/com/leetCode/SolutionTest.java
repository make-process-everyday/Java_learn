package com.leetCode;

public class SolutionTest {
    public static void main(String[] args) {
    ListNode a = new ListNode(3);
    ListNode b = new ListNode(2);
    ListNode c = new ListNode(0);
    ListNode d = new ListNode(-4);
    a.setNext(b);
    b.setNext(c);
    c.setNext(d);
    d.setNext(b);
    Solution solution = new Solution();
    ListNode result = solution.detectCycle(a);
    }
}
