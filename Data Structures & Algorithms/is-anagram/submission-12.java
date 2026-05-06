class Solution {
    public boolean isAnagram(String s, String t) {
        //using hashmaps since ordering does not matter but can have multiple of same characters to compare
        HashMap<Character, Integer> stringS = new HashMap<>();
        HashMap<Character, Integer> stringT = new HashMap<>();

        if((s.length() ==t.length())){
            //populating maps if length same

            for(int i = 0; i<=s.length()-1; i++) { 
                //checking if key exists, if not create new with count of 1
                if(stringS.containsKey(s.charAt(i))) {
                    stringS.put(s.charAt(i), stringS.get(s.charAt(i))+1);
                } else {
                    stringS.put(s.charAt(i), 1);
                }

                //checking if key exists, if not create new with count of 1
                if(stringT.containsKey(t.charAt(i))) {
                    stringT.put(t.charAt(i), stringT.get(t.charAt(i))+1);
                } else {
                    stringT.put(t.charAt(i), 1);
                }
            }
            //compare maps
            if(stringS.equals(stringT)) { 
                return true; 
            } else {
                return false; 
            } 
        }
        //false if lengths not same
        return false;
    }
}
