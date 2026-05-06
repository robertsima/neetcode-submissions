class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index1 = 0; 
        int index2 = 1;
        int temp = 0;

        while((nums[index1] + nums[index2]) != target) {

            if((index2 == nums.length-1) || index2 >= nums.length){
                index2 = temp;
                temp++;
                index1++;
            }
            
            index2++;

            if(index2 == index1){
                index2++;
                continue;
            }
        }
        int[] output = {index1, index2}; 

        return output; 
    }
}
