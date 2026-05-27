class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int[] ans = new int[k]; 

        //populate lookup with freq
        for(int i = 0; i < nums.length; i ++) { 
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> keys = new ArrayList<>(freq.keySet()); //list of all keys

        Collections.sort(keys, (key1 , key2) -> Integer.compare(freq.get(key2), freq.get(key1)));
        // Collections.sort(keys, (key1, key2) -> Integer.compare(freq.get(key2), freq.get(key1)));

        for(int i =0; i < k; i++) { 
            ans[i] = keys.get(i); 
        }

        return ans; 
    }
}
