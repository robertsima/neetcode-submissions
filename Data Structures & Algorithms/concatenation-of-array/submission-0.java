class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2]; 

        for(int i = 0; i<nums.length; i++) { 
            int j = nums.length + i; //setting j to second pointer 

            ans[i] = nums[i]; //set first pointer
            ans[j] = nums[i]; //set second pointer
        }

        return ans; 
    }
}