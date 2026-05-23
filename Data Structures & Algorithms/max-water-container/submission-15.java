class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int left = 0; 
        int right = heights.length-1; 

        while(left < right) {
            //set vars to make code legible
            int length = (right - left);
            int height = Math.min(heights[left], heights[right]); 
            int currentArea = length * height;

            //set maxArea
            maxArea = Math.max(maxArea, currentArea);

            if(heights[right] > heights[left]) { 
                left++;
            } else {
                right--; 
            }
        }
        return maxArea; 
    }
}
