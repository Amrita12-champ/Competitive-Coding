class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            int newReverse = reverse * 10 + digit;
            if ((newReverse - digit) / 10 != reverse) {
                return 0;
            }
            reverse = newReverse;
        }
        
        return reverse;
    }
}