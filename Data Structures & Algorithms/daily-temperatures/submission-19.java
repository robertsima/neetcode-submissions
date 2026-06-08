class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //init left and right boundaries
        int right = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] answer = new int[temperatures.length]; //create array of same size for answer

        for(int left = 0; left < temperatures.length - 1; left++){ 
            right = left; 

            //sliding window expands to find shortest num of days before it gets hotter
            while(temperatures[left] >= temperatures[right] && right < temperatures.length - 1) { 
                right++;
                stack.push(right - left); //using a stack to push index
                
                }

                //if we found a hotter day and not on last left index, we set left
                if (temperatures[right] > temperatures[left]) {
                    answer[left] = stack.pop();
                }

                //reset stack
                stack.clear();
            }
            
            return answer; 
    }
}
