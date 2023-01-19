## Regression + Partition

#### LeetCode 50 - Pow(x,n)

Question:

Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Brainstorm:

regression.

Need to think of:

1. even number make it to pow(x*x, n/2)
2. odd number make it to: (positive n) pow(x*x, n/2) * x     (negative n) pow(x*x, n/2) * 1/x