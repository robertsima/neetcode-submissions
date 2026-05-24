class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        int currentIndex = 0; 
        List<Integer> currentList = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        backtrack(nums, target, currentIndex, currentList, ans);

        return ans;
    }


    public void backtrack(int[] nums, int target, int currentIndex, List<Integer> currentList, List<List<Integer>> ans) {
        if(target == 0) { //base case
            ans.add(new ArrayList<>(currentList)); 
            return; 
        }

        if(currentIndex == nums.length || target < 0) {
            return; 
        }

        //backtrack same index
        currentList.add(nums[currentIndex]);
        backtrack(nums, target - nums[currentIndex], currentIndex, currentList, ans); 

        //backtrack next index
        // backtrack(nums, target - nums[currentIndex], currentIndex + 1, currentList, ans); 

        //skip and backtrack
        currentList.remove(currentList.size() - 1);
        backtrack(nums, target, currentIndex + 1, currentList, ans); 
    }
}
