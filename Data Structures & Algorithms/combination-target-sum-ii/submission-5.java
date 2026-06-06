class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(0, target, answer, new ArrayList<>(), nums);

        return new ArrayList<>(answer);
    }

    public void backTrack(int start, int target, List<List<Integer>> answer, List<Integer> currList,  int[] nums){
        if(target < 0) {  // Negative targets get thrown out.
            return;
        }
        else if(target == 0){
            answer.add(new ArrayList<>(currList)); //We hit our target, so add.
        }
        else {
            for(int i = start; i < nums.length; i++){
                if(i > start && nums[i] == nums[i-1]) continue; //See 1.
                currList.add(nums[i]); // Add to list
                backTrack(i+1, target - nums[i], answer, currList, nums);
                currList.remove(currList.size() - 1); //Backtrack addition
                //Note, this method uses a loop, so we do NOT re-add recurse again like in NeetCode's solution.

                if (target - nums[i] < 0) { //See 2.
                    break;   
                }
            }
        }
    }
}