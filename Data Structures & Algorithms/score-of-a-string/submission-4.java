class Solution {
    public int scoreOfString(String s) {
        int total = 0; //start with 0

        if(s.length() < 2) { //do we have 2 chars?
            return 0; 
        }

        //loop through two integers at a time, 1 loop
        for(int right = 1; right < s.length(); right++) { 
            int left = right - 1;

            //setting ascii nums 
            int leftNum = s.charAt(left) - '0'; 
            int rightNum = s.charAt(right) - '0'; 

            total += Math.abs(rightNum - leftNum);
        }

        return total; 
    }
}