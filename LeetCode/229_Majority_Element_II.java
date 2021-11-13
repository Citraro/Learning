class Solution {
    public List<Integer> majorityElement(int[] nums) {
       
        List<Integer> list = new ArrayList<>();
        
        Integer num1 = null, num2 = null;
        int c1 = 0, c2 = 0;
        
        for(int num : nums){
            if(num1 != null && num == num1){
                c1++;
            }else if(num2 != null && num == num2){
                c2++;
            }else if (c1 == 0){
                num1 = num;
                c1 = 1;
            }else if (c2 == 0){
                num2 = num;
                c2 = 1;
            }else{
                c1--;
                c2--;
            }
        }
        
        int count = 0;
        for(int num : nums){
            if(num1 != null && num == num1){
                count++;
            }
        }
        if(count > nums.length / 3){
            list.add(num1);
        }
        
        count = 0;
        for(int num : nums){
            if(num2 != null && num == num2){
                count++;
            }
        }
        if(count > nums.length / 3){
            list.add(num2);
        }
        
        return list;
        
    }
}
