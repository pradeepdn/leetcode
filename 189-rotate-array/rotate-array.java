class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1 || k == 0 || nums.length == k) return;
        k = k % nums.length;
        int[] sol = new int[nums.length];
        int i = nums.length-k;
        int count = nums.length;
        int j=0;
        while(count>0){
            sol[j] = nums[i];
            i = (i+1) % nums.length;
            j++;
            count--;
        }
    System.arraycopy(sol, 0, nums, 0, nums.length);
    }
}