class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> answer = new ArrayList<>(); 
        Map<String, List<String>> groupedStrings = new HashMap<>(); 

        for(int i = 0; i<strs.length; i++) {
            String unsorted = strs[i];

            char[] charArray = unsorted.toCharArray();
            Arrays.sort(charArray);
            String current = new String(charArray);


            List<String> tempList = new ArrayList<>(); 

            if(!groupedStrings.containsKey(current)) { 
                tempList.add(unsorted);
                groupedStrings.put(current, tempList); 
                continue; 
            }

            tempList = groupedStrings.get(current);
            tempList.add(unsorted); 
            groupedStrings.replace(current, tempList); 
        }

        groupedStrings.forEach((string, list) -> {
            answer.add(list); 
        });
        
        return answer; 
    }
}
