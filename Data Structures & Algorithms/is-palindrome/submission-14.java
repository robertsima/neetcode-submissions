class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();
        int left = 0; 
        int right = arr.length-1; 
        Boolean answer = true; 

        while(left < right) { //loop until converge
            if(arr[left]!=arr[right]) {
                return false; 
            } 
            else { 
                left++; 
                right--;
            }
        }

        return answer;
    }
}
