package com.platform.challenge.LeetCode.Problems;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in
reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 */
public class AddTwoNumbers {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode n1 = l1, n2 = l2, head, current;
            head = current = new ListNode(0);
            int carry = 0, rem = 0, sum = 0;
            while (n1 != null || n2 != null || carry != 0) {
                sum = (n1 != null ? n1.val : 0) + (n2 != null ? n2.val : 0) + carry;
                carry = sum / 10;
                rem = sum % 10;
                current = current.next = new ListNode(rem);
                n1 = (n1 == null ? null : n1.next);
                n2 = (n2 == null ? null : n2.next);
            }
            return (head.next == null ? null : head.next);

        }

}
