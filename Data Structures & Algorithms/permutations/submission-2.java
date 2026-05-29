class Solution {
    List<List<Integer>> ans = new ArrayList<>(); 
    List<Integer> current = new ArrayList<>();  

    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums); //recursion call

        return ans; 
    }

    private void backtrack(int[] nums) {
        if(current.size() == nums.length) { //check before for loop
            ans.add(new ArrayList<>(current)); 
            return; 
        }
 
        for(int i = 0; i < nums.length; i++) { //loop to check each possible option for each index
            if (current.contains(nums[i])) { //dont add if we have it 
                continue;
            }

            // take this val
            current.add(nums[i]);

            // recursion call continues w this val
            backtrack(nums);

            // undo so that next loop can continue without val
            current.remove(current.size() - 1);
        }
    }
}
