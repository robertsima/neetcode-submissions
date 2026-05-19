class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        Map<String, List<String>> lookup = new HashMap<>(); 


        for(int i = 0; i < strs.length; i++) {

            if(strs[i] == null || strs[i] == "")  { //null check
                continue; 
            }

            char[] chars = strs[i].toCharArray(); //converting string to sorted string
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            List<String> valueList; 

            //creating arrayList for vals from lookup
            if(lookup.containsKey(sortedStr)) { 
                valueList = new ArrayList<>(lookup.get(sortedStr));
                valueList.add(strs[i]);
                lookup.replace(sortedStr, valueList); 
            } else { 
                valueList = new ArrayList<>();
                valueList.add(strs[i]);
                lookup.put(sortedStr, valueList); 
            }
        } 

        lookup.forEach((key, value) -> answer.add(value)); 

        return answer; 

    }
}
