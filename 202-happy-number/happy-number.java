/** Improved version */
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> squares = new HashSet<>();

        while (n!=1){
            n = squaresOfDigits(n);

            if(!squares.add(n)){
                return false;
            }
        }
        return true;
    }
    public int squaresOfDigits(int k) {
        int square = 0;
        while (k != 0) {
            square = square + ((k % 10) * (k % 10));
            k = k / 10;
        }
        return square;
    }
}


/** My first solution  */
// class Solution {

//     public boolean isHappy(int n) {
//         if(n==1) return true;
//         HashSet<Integer> squares = new HashSet<>();
//         squares.add(n);
//         int num = squaresOfDigits(n);

//         while (squares.contains(num) == false) {
//             if (num == 1) {
//                 return true;
//             }
//             squares.add(num);
//             num = squaresOfDigits(num);
//         }
//         return false;

//     }

//     public int squaresOfDigits(int k) {
//         int square = 0;
//         while (k != 0) {
//             square = square + ((k % 10) * (k % 10));
//             k = k / 10;
//         }
//         return square;
//     }
// }