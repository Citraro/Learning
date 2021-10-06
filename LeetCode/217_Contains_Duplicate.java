class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> values = new HashSet<>();
        for(int x : nums){
            if(!values.add(x)){
                return true;
            }
        }
        return false;
    }
}