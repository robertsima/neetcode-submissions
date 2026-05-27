class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>(); 
        int left = 0; 
        int right = nums.length-1; 


        while(left <= right) {
            if(seen.contains(nums[left]) || nums[left] == nums[right]) { 
                return nums[left]; 
            }
            if(seen.contains(nums[right])) { 
                return nums[right];
            }

            seen.add(nums[left]);
            seen.add(nums[right]);

            left++;
            right--;  
        }

        return 0; 
    }
}
