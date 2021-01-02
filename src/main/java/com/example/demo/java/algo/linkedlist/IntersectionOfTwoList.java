package com.example.demo.java.algo.linkedlist;

public class IntersectionOfTwoList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = 0;
        int l2 = 0;
        ListNode temp = headA;
        while (temp != null) {
            l1++;
            temp = temp.next;
        }
        temp = headB;
        while (temp != null) {
            l2++;
            temp = temp.next;
        }
        if (l1 > l2) for (int i = 0; i < l1 - l2; i++) headA = headA.next;
        else if (l2 > l1) for (int i = 0; i < l2 - l1; i++) headB = headB.next;
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
