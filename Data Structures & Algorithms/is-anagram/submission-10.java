class Solution {
    public boolean isAnagram(String s, String t) {
        //using hashmaps since ordering does not matter but can have multiple of same characters to compare
        HashMap<Character, Integer> stringS = new HashMap<>();
        HashMap<Character, Integer> stringT = new HashMap<>();

        //populating stringS
        for(int i = 0; i<=s.length()-1; i++) { 
            if(stringS.containsKey(s.charAt(i))) {
                stringS.put(s.charAt(i), stringS.get(s.charAt(i))+1);
            } else {
                stringS.put(s.charAt(i), 1);
            }
        }

        //populating stringT
        for(int i = 0; i<=t.length()-1; i++) { 
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
}
