class Solution {
    public boolean isSubsequence(String s, String t) {
        //sliding window
        Map<Character, Integer> lookup = new HashMap<>();
        char[] listT = new char[t.length()]; 
        StringBuilder sb = new StringBuilder();
        //check for null
        if(s.length() == 0){ 
            return true; 
        } 

        if(t.length() == 0) { 
            return false; 
        }

        //populate array to compare/manipulate
        for(int i = 0; i < t.length(); i++) {
            listT[i] = t.charAt(i);
        }

        //loop string s, check if char is in string t then set to subarray
        //if it is, enter while(listT.get(i) != s.charAt(i)), remove chars from list until loop done
        //remove first element from t
        int j = 0;

        for(int i = 0; i < s.length(); i++) {
                while (j < listT.length && listT[j] != s.charAt(i)) {
                    j++;
                }

                if (j == listT.length) { //is index j same as length before reaching the end of s?
                    return false;
                }
                
                sb.append(listT[j]);

                if (j + 1 < listT.length) {
                    listT = Arrays.copyOfRange(listT, j + 1, listT.length);
                } else {
                    listT = new char[0]; //set to empty if no more
                }

                j = 0;

            if(!s.substring(0, i+1).equals(sb.toString())) { 
                return false;
            }
        }


        //compare array to string and return boolean based on case
        if(s.equals(sb.toString())) { 
            return true;
        }

        return false; 
    }
}