class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        HashSet<List<Integer>> set=new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            
            for(int j=i+1;j<nums.length;j++){
                HashMap<Long,Integer> map=new HashMap<>();
                for(int k=j+1;k<nums.length;k++){
                    long l=(long)target-((long)nums[i]+(long)nums[j]+(long)nums[k]);
                    if(map.containsKey(l)){
                        List<Integer> list = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],(int)l));
                    Collections.sort(list);
                    set.add(list);
                    }
                    map.put((long)nums[k],k);
                }
            }
        }
        ans.addAll(set);
        return ans;
    }
}