class Solution {
    public int findMin(int[] nums) {
        //binary search answer
        int left = 0;
        int right = nums.length-1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            if(left == right)
                return nums[left];
            if(nums[right] < nums[mid]) { 
                left = mid+1; 
            } else { 
                right = mid;
            }
        }

        return nums[0];
        //trivial answer

    }
}
