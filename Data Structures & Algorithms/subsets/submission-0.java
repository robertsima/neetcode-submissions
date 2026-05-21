class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        int index = 0;
        List<Integer> currentDecision = new ArrayList<>();

        backtrack(nums, answer, index, currentDecision); 

        return answer; 
    }

    public void backtrack(int[] nums, List<List<Integer>> answer, int index, List<Integer> currentDecision) {
        //base case
        if(index == (nums.length)) { 
            answer.add(new ArrayList<>(currentDecision)); 
            return; 
        }

        //happy path
        currentDecision.add(nums[index]);
        backtrack(nums, answer, index + 1, currentDecision); 

        //sad path
        currentDecision.remove(currentDecision.size()-1);
        //execute
        backtrack(nums, answer, index + 1, currentDecision);  
    }
}
