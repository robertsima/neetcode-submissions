/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        // ListNode ans = new ListNode(); //do we need this or return head
        //left pointer
        ListNode left = head;
        ListNode right = new ListNode();

        //right pointer
        if(head != null){ 
            right = head.next;
        }

        while(right != null && head != null) { //if we are not at the end of the list
            ListNode temp = right; // temp val to move stuff without changing right
            right = right.next;

            left.next = temp.next; //remove current right node and link to next

            temp.next = head; //set temp to first val
            head = temp; //set head to first val

        }

        return head; 
    }
}
