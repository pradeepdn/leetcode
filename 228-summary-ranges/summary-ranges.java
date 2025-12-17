class Solution {
    public List<String> summaryRanges(int[] nums) {
        

        ArrayList<String> summary = new ArrayList<>();
        int start = 0;
        if (nums.length == 1) {
            summary.add(String.valueOf(nums[0]));
            return summary;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == 0) {
                start = nums[i];
            }

            if (nums[i + 1] != nums[i] + 1) {
                if (start == nums[i]) {
                    System.out.println(nums.length);
                    summary.add(String.valueOf(start));
                    start = nums[i + 1];
                }else{
                summary.add(start + "->" + nums[i]);
                start = nums[i + 1];
                }
            }
            if (i == nums.length - 2) {
                //System.out.println(nums.length);
                if (start != nums[i + 1]) {
                    summary.add(start + "->" + nums[i + 1]);
                } else if (start == nums[i + 1]) {
                    summary.add(String.valueOf(start));
                }
            }

        }
        return summary;
    }
}