class Solution {
    public String triangleType(int[] nums) {
        String ans="";
        if((nums[0]+nums[1])>nums[2]&&(nums[1]+nums[2])>nums[0]&&(nums[0]+nums[2])>nums[1]){
            if(nums[0]==nums[1]&&nums[1]==nums[2]){
                ans="equilateral";
            }
           
             else if(nums[0]==nums[1]||nums[1]==nums[2]||nums[0]==nums[2]){
                ans="isosceles";
            }
        else{
            ans="scalene";
    }
        }
        else{
            ans="none";
        }
    return ans;
}
}
