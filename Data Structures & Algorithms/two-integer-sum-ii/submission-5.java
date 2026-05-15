class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0; 
        int right = numbers.length-1; 
        int[] answer = new int[2]; 

        while(left<right) {
            int sum = numbers[left] + numbers[right];
            if(sum == target){ 
                answer[0] = left + 1; //adding 1 to account for 1-indexed
                answer[1] = right + 1;

                return answer;
            } 

            else if(target > sum){
                left++;
            } else { 
                right --; 
            }
        }
        
        return answer; 
    }
}
