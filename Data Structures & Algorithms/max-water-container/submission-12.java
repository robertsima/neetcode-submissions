class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int start = 0; 
        int end = heights.length-1; 

        while(start < end) { 
            int height = Math.min(heights[start], heights[end]); 
            int length = end - start; 

            area = Math.max(area, height*length); 

            if(heights[end] > heights[start]) { 
                start ++; 
            } else end --; 
        }

        return area; 
    }
}
