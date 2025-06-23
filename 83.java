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
    public ListNode removeDuplicate(ListNode head){
        ListNode curr = head;

        while(curr!=null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }
}