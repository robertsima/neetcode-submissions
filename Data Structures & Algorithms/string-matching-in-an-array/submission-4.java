class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> substring = new ArrayList<>(); 

        for(int i = 0, j = 0; i<words.length; i++ ) { //index at i is word we are using to check for substrings
            if(i == j){ 
                j++; //not the same index
            }

            while(j < words.length) { //index at j is word we put inside substring
                if(words[i].contains(words[j]) && j != i && !substring.contains(words[j])){ //no dups, is substring, and not the same index
                    substring.add(words[j]); 
                }
                j++;
            }

            j = 0; //reset j so that we check every word
        }
        return substring;
    }
}