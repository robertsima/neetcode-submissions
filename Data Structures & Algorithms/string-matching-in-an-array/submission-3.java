class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> substring = new ArrayList<>(); 

        for(int i = 0, j = 0; i<words.length; i++ ) {
            if(i == j){ 
                j++;
            }

            while(j < words.length) {
                if(words[i].contains(words[j]) && j != i && !substring.contains(words[j])){ 
                    substring.add(words[j]); 
                }
                j++;
            }

            j = 0;
        }
        return substring;
    }
}