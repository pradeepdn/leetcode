class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> result = new ArrayList<>();
        boolean inserted = false;

        for (int i = 0; i < intervals.length; i++) {
            // Case 1: current interval is before newInterval
            if (intervals[i][1] < newInterval[0]) {
                result.add(intervals[i]);
            }
            // Case 2: current interval is after newInterval
            else if (intervals[i][0] > newInterval[1]) {
                if (!inserted) {
                    result.add(newInterval);
                    inserted = true;
                }
                result.add(intervals[i]);
            }
            // Case 3: overlap → merge
            else {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }

        if (!inserted) {
            result.add(newInterval);
        }

        return result.toArray(new int[0][]);
    }
}
