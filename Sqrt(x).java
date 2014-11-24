public class Solution {
    public int sqrt(int x) {
        long low = 0;
        long high = x / 2 +1;
        while (low <= high) {
            long mid = (low + high) / 2;
            if (mid * mid == x) {
                return (int)mid;
            }
            if (mid * mid < x) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return (int)high;
    }
}//Newton's Method and binary search