class Solution {
    public int mySqrt(int x) {
        /* Newton–Raphson */

        // if (x == 0) return 0;
        // double guess = x / 2.0;

        // while (Math.abs(guess*guess - x) > 1e-6){
        //     guess = (guess + x / guess) / 2.0;
        // }

        // return (int)guess; 

        /* Binary Search */

        int left = 1;
        int right = x;
        int res = 0;
        if (x == 0) return 0;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) { 
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }   
    return res;
    }
}
