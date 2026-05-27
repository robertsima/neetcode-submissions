class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int longestSequence = 0;
        int currentSequence = 0; 

        // for(int num: nums[]) { //populate lookup
        //     seen.add(num); 
        // }
        int start = 0; 
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {

            if(seen.contains(nums[i])) { //do nothing for dups
                continue; 
            }

            if(i==0) {
                longestSequence++;
                seen.add(nums[i]); //adding current to seen
                continue;
            }

            seen.add(nums[i]); //adding current to seen
            if(nums[i] - nums[i-1] != 1){
                start = i;
            }

            longestSequence = Math.max(longestSequence, nums[i-1] + 1 - nums[start] + 1); 
        }

        return longestSequence; 
    }
}
