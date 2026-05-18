class Solution {
    public int lengthOfLongestSubstring(String s) {
        // List<Character> chars = new ArrayList<>(Arrays.toList(s.toCharArray())); 
        Set<Character> lookup = new HashSet<>(); 
        int longestStr = 0;
        int currentStr = 0; 

        for(int right = 0, left = 0; right < s.length(); right ++) {
            while(lookup.contains(s.charAt(right))) { //case where sequence breaks
                lookup.remove(s.charAt(left));
                left ++;
            }
            lookup.add(s.charAt(right));
            currentStr = right - left + 1; 
            longestStr = Math.max(currentStr, longestStr);
        }

        return longestStr;
    }
}
