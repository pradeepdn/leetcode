// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         int num = nums[0];
//         int count = 1;
//         int k= nums[0];
//         int max=1;
//         for(int i=1;i<nums.length;i++){
//             if(k == nums[i]){
//                 count++;
//                 if(max < count){
//                 max = count;
//                 num = nums[i];
//                 }
//             }           
//             else {
//                 k = nums[i];
//                 count = 1;
//             }
//         }
//     System.out.println(count);
//     return num;
//     }
// }

//Boyer – Moore Majority Vote Algorithm — the O(n), no-sort solution

class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}

// sort STL

// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length / 2];
//     }
// }
