class Solution {
    public int lengthOfLastWord(String s) {
        //loop starting at the end of the string so we can find the first space

        int counter = 0; //keep track of string length
        //boolean to check if we encountered a non-space char yet
        Boolean seenWord = false; 
        
        for(int i = s.length()-1; i>=0; i--) {
            if(seenWord==false && s.charAt(i) == ' ') { 
                continue; //skip this index no word yet
            }

            if (s.charAt(i) != ' ') { //if we dont have a space we count and continue
                seenWord = true; 
                counter++; 
                continue;
            } 
            
            if(s.charAt(i) == ' ' && seenWord == true) { //find a space after detecting a word - we return
                return counter;
            }
        }
        return counter; //return 0
    }
}