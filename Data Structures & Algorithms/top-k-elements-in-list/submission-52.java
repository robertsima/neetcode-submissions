class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums); 
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int[] result = new int[k];


        for(int num: nums) { //populate map for lookup
            if(frequencyMap.containsKey(num)) { 
                frequencyMap.replace(num, frequencyMap.get(num) + 1); 
                continue;
            }
            frequencyMap.put(num, 1); 
        }

        ArrayList<Integer> tempVals = new ArrayList<>(frequencyMap.keySet()); 
        tempVals.sort((firstVal, secondVal) -> frequencyMap.get(secondVal) - frequencyMap.get(firstVal)); //sort tempVals based on map keyset/frequency
        
        for(int i = 0; i < k; i++){
            result[i] = tempVals.get(i); 
        }

        return result;
    }
}
