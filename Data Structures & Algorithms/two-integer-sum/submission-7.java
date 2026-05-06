class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        int difference;
        int[] output = new int[2];

        for (int i = 0; i<nums.length; i++) {
            difference = target - nums[i];
            if(numsMap.containsKey(difference)){
                output[1] = i;
                output[0] = numsMap.get(difference);
                break;
            }
            numsMap.put(nums[i], i);
            
        }

        return output;
    }
}
