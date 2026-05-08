class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        int count = 0; 
        Set<Integer> set = new HashSet<>();

        for(int num: nums) { //populate set
            set.add(num); 
        }

        for(int num: set) { 
            if(!set.contains(num-1)) { //if num-1 doesnt exist, must be a start number

                int current = num;
                count++;

                while(set.contains(current+1)){ //increment for each num that is +1
                    current++;
                    count++;
                }

                longest = (count > longest) ? count : longest;
                count = 0;
            }

        }
        return longest;
    }
}
