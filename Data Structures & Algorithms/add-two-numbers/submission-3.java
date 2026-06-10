class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        java.math.BigInteger num1Converted = convertToBigInt(l1); 
        java.math.BigInteger num2Converted = convertToBigInt(l2); 

        java.math.BigInteger result = num1Converted.add(num2Converted);

        return convertToLinkedList(result); 
    }

    public java.math.BigInteger convertToBigInt(ListNode list) {
        java.math.BigInteger result = java.math.BigInteger.ZERO;
        java.math.BigInteger place = java.math.BigInteger.ONE;

        while (list != null) {
            result = result.add(place.multiply(java.math.BigInteger.valueOf(list.val)));
            place = place.multiply(java.math.BigInteger.TEN);
            list = list.next;
        }

        return result;
    }

    public ListNode convertToLinkedList(java.math.BigInteger num) {
        String s = num.toString();

        ListNode head = new ListNode(s.charAt(s.length() - 1) - '0');
        ListNode temp = head;

        for (int i = s.length() - 2; i >= 0; i--) {
            temp.next = new ListNode(s.charAt(i) - '0');
            temp = temp.next;
        }

        return head;
    }
}