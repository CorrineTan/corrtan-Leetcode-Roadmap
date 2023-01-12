## preSum + TwoPointer

#### LeetCode 1695 - Maximum Erasure Value

Use HashSet - only one value - the element that needs to push into the list.

Use a sliding window - start from 0 and loop the end.

Whenever the nums[end] is found in hashset (hashset.contains), need to: <br>
1. remove the element from the hashset,
2. Reduce the element from the sum,
3. sliding window left side (start) ++

Otherwise, just add element to hashset, add sums, and calculate the largest sum.
