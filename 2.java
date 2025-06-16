//2. Add two numbers
//LinkedList

import java.util.*;
class ListNode{
    int val;
    ListNode next;

    ListNode(){}
    ListNode(int v){
        this.val = v;
    }
    ListNode(int v, ListNode n){
        this.val = v;
        this.next = n;
    }
}

class Solution{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0;
        while(l1.next != null || l2.next != null || carry !=0){
            int sum = carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum/10;
            int digit = sum %10;
            current.next = new ListNode(digit);
        }

        return dummy.next;
    }
}
