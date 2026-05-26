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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //null checks
        if(list1 == null) return list2;
        
        if (list2 == null) return list1; 

        //temp and dummy node 
        ListNode ans = new ListNode();
        ListNode temp = ans;

        while(list1 != null && list2 != null) { 
            if(list1.val <= list2.val) { 
                temp.next = list1; //set next on ans to l1.next
                list1 = list1.next;

            } else { 
                temp.next = list2; //set next on ans to l2
                list2 = list2.next;
            }
            temp = temp.next; 
        }

        if (list1 != null) { //attach whatever is left
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        return ans.next; 
    }
}