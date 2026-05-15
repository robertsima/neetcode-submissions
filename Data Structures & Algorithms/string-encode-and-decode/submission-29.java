class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        if(strs.isEmpty()) { 
            return null;
        }

        for(int i = 0; i<strs.size(); i++){
            int start = 0; 
            int end = strs.size()-1;

            if (i == end) { 
                sb.append(strs.get(i)); 
                break;
            }

            sb.append(strs.get(i) + "#$#split#$#");      
        }

        return sb.toString();
    }

    public List<String> decode(String str) { 
        List<String> answer = new ArrayList<>(); 
        // String[] parts = str.isEmpty() ? new String[0] : str.split("\\#\\$\\#", -1);
        
        if((str!=null)){
            String[] parts = str.split(Pattern.quote("#$#split#$#"), -1);
            for(String part: parts){ 
                answer.add(part); 
            }
        }

        return answer;
    }
}
