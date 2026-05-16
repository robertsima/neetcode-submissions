class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] answer = new int[size];
        int prefix = 1; //before index 

        for (int i = 0; i < size; i++) { //set each answer index to track prefix, then set prefix to next val
            answer[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1; //after index

        for (int i = size - 1; i >= 0; i--) { //set each answer to prefix(answer[i]) * suffix
            answer[i] *= suffix;
            suffix *= nums[i];
        }


        return answer; 
    }
}  
