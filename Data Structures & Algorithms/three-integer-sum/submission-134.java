class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();

        for(int stable = 0; stable<nums.length-2; stable++) {

            if (stable > 0 && nums[stable] == nums[stable - 1]) {
                continue;
            }

            int left = stable + 1; 
            int right = nums.length - 1; 

            while(left < right) {
                int sum = nums[left] + nums[right] + nums[stable]; 
                if(sum == 0) { 
                    answer.add(Arrays.asList(nums[stable], nums[left], nums[right]));
                    left++; 
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) { 
                    left++;
                } else { 
                    right--;
                }
            } 
        }
        return answer; 
    }
}
