class Solution {
    public double myPow(double x, int n) {
        if (n==0) return 1.0;
        if (n % 2 == 0) {
            x = myPow(x * x, n / 2);
        } else if (n > 0) {
            x = myPow(x * x, n / 2) * x;
        } else {
            x = myPow(x * x, n / 2) * (1.0 / x);
        }
        return x;
    }
}