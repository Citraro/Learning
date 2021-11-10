class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length == 0 || strs == null){
            return new ArrayList<>();
        }
        
        Map<String,List<String>> map = new HashMap<>();
        
        for(String str : strs){
            char[] c = new char[26];
            for(char element : str.toCharArray()){
                c[element - 'a']++;
            }
            
            String key = String.valueOf(c);
            
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        
        return new ArrayList<>(map.values());
        
    }
}
