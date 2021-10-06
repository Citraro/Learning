class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int x = 0; x < nums.length; x++) {
            map.put(nums[x],x);
        }
        
        for(int x = 0; x < nums.length; x++) {
            int neededNum = target - nums[x];
            if(map.containsKey(neededNum) && map.get(neededNum) != x){
                return new int[] { x , map.get(neededNum)};
            }
        }
        return new int[]{};
    }
}