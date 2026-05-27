class Solution {
    public int[] twoSum(int[] nums, int target) {
        //two pointer converging solution
        int i = 0; 
        int j = i + 1; 

        while(i < j) { 
            int sum = nums[i] + nums[j]; 

            if(sum == target) { 
                return new int[]{i,j}; 
            }

            if(j == nums.length-1) { //reset when reaching end
                i += 1;
                j = i;
            }

            j++;
        }
        return null;
    }
}
