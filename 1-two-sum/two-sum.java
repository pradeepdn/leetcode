class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> pair = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int req = target - nums[i];
            if(pair.containsKey(req)){
                return new int[] { pair.get(req), i };

            }else{
                pair.put(nums[i], i);
            }
        }
        
    return new int[] {};
    }
}