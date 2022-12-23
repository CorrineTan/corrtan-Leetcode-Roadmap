## Array and Linkedlist

#### LeetCode 26 - Remove Duplicates from Sorted Array

Q:Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.


Brainstorming:
Wanna have a for loop going through the elements and comparing with the previous one element, if same value I'll delete the latter one. However, leetcode's hint makes me to use Java Primitive array (instead of Arraylist), so remove is not a in-built method. 

```
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        for (i == 0; i < n; i++ ){
            if (nums[i] == nums[i-1]){
                Remove nums num[i]
            }
        }
    }
}
```

But with Java Primitive array it seems really complex. Then I have no idea and need to take a reference to the answer - use TWO POINTERS!

Then 1st round the code is like below:

```
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        for (int i = 0; i < n; i++){
            if (nums[i] == nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
```

Ofcourse the error with index out of bounds:

```
java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3
  at line 6, Solution.removeDuplicates
  at line 54, __DriverSolution__.__helper__
  at line 84, __Driver__.main
```

This is because the 1st element don't need to be compared with the last element (index -1). Fixed the if statement with 

```
if (i == 0 || nums[i] != nums[i-1])
```



