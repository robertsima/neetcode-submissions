class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyLookup = new HashMap<>(); 
        int[] ans = new int[k];

        for(int i = 0; i < nums.length; i++) { 
            if(frequencyLookup.containsKey(nums[i])){
                int frequency = frequencyLookup.get(nums[i]) + 1; 
                frequencyLookup.put(nums[i], frequency); 
            } else {
                frequencyLookup.put(nums[i], 1); 
            }
        }

        ArrayList<Integer> newNums = new ArrayList<>(frequencyLookup.keySet()); //set to key set
        newNums.sort((firstVal, secondVal) -> frequencyLookup.get(secondVal) - frequencyLookup.get(firstVal)); //sort key set array by value array in map
        //^ sorted in descending, easier to call each index based on k

        for(int i = 0; i < k; i++){ 
            ans[i] = newNums.get(i); 
        }

        return ans;
    }
}
