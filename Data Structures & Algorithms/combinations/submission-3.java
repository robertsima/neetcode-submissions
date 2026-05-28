class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> current = new ArrayList<>();  

    public List<List<Integer>> combine(int n, int k) {

        backtrack(n, k); 

        return ans; 
    }

    private void backtrack(int n, int k) {

        //base case
        if(current.size() == k) { 
            ans.add(new ArrayList<>(current));
            // current.clear(); 
            return;
        }

        if(n == 0) {//cases we want to ignore
            return; 
        }

        //take
        current.add(n); 
        backtrack(n-1, k); 

        //dont take
        current.remove(current.size() - 1); 
        backtrack(n-1, k);  
    }
}