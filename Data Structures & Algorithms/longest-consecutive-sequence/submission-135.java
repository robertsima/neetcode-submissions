class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); //store unique values + longest consecutive as value
        int longest; 
        
        //initialize with val of 1 for each num
        for(int num : nums) { 
            map.put(num, 1);
        }

        for(Integer num: map.keySet()) {
            if(!map.containsKey(num-1)) { //if is a starting number
                int current = num; //current seq int to check
                while(map.containsKey(current+1)){ 
                    map.put(num, (map.get(num) + 1));
                    current++;
                }
            }
        }

        longest = (!map.isEmpty())? Collections.max(map.values()): 0;

        return longest;
    }
}
