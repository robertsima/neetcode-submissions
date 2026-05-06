class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap numsMap = new HashMap<>(); 
        boolean appears = false;

        for(int i = 0; i<nums.length; i++) {
            if(numsMap.get(nums[i]) != null){
                appears = true; 
                break; 
            }
            numsMap.put(nums[i], i);
        }

        return appears;
    }
}