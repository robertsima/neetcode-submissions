class Solution {

    public boolean isValid(String s) {
        Map<Character, Character> charMap = new HashMap<>(); 

        Deque<Character> deque = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if(c == '(') {
                deque.offerFirst(')');
            } else if (c == '[') { 
                deque.offerFirst(']');
            } else if (c == '{') { 
                deque.offerFirst('}');
            }
            else {
                if(deque.isEmpty() || deque.pollFirst() != c) { 
                    return false;
                } 
            } 
        }
        return deque.isEmpty();
    }
}
