class Solution {

    public boolean isValid(String s) {
        Map<Character, Character> charMap = new HashMap<>(); 

        Deque<Character> deque = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if(c == '(') {
                deque.offerFirst(')'); //expecting closing brackets
            } else if (c == '[') { 
                deque.offerFirst(']'); 
            } else if (c == '{') { 
                deque.offerFirst('}');
            }
            else {
                if(deque.isEmpty() || deque.pollFirst() != c) { //found closing bracket, no opening bracket
                    return false; //found a character that doesnt contain expected, also returns and removes c
                } 
            } 
        }
        return deque.isEmpty();
    }
}
