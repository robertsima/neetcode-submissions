class Solution {
    public boolean hasDuplicate(int[] nums) {
        int left = 0; 
        int right = nums.length - 1; 
        Set<Integer> lookup = new HashSet<>(); 

        while(left < right) {
            Boolean containsLeft = lookup.contains(nums[left]);
            if(containsLeft) { 
                return true; 
            } else{ 
                lookup.add(nums[left]);
                left++;
            }

            Boolean containsRight = lookup.contains(nums[right]);
            if(containsRight) { 
                return true; 
            } else {
                lookup.add(nums[right]);
                right--;
            }
        }
        return false; 
    }
}