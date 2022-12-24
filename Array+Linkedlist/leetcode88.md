## Array and Linkedlist

#### LeetCode 88 - Merge Sorted Array

Q: You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

BrainStorming:

Note that these two arrays are already sorted. The idea is to always compare the last element of the array, the largest will be put to the merged array (array 1)'s last element.

However when trying I got Time Limit Exceeded with following code:

```
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int cur = n + m - 1;
        while (j >= 0) {
            if (i > 0 && nums1[i] > nums2[j]){
                nums1[cur] = nums1[i];
                cur--;
                i--;
            } else if (i > 0 && nums1[i] <= nums2[j]) {
                nums1[cur] = nums2[j];
                cur--;
                j--;
            }
        }
    }
}
```

But else shouldn't have have condition in it. I dont understand this step clearly. Need to check other people's solution too. 

```
else {
                nums1[cur] = nums2[j];
                cur--;
                j--;
 }
```

### Learn From Official Answer

Approach 1: Sorting

First put nums2 into the extra space of the nums1 by: 

```
nums1[m+i] = nums2[i]
```

Then simply sort it:

```
Arrays.sort(nums1)
```


