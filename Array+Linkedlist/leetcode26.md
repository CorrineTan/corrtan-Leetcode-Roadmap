## Array and Linkedlist

#### LeetCode 26 - Remove Duplicates from Sorted Array

Q:Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.


Brainstorming: <br>
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

### Learn From Official Answer
In-place: not creating a new array. <br>
Concept of Pass by reference.

The problem would have been simpler if we are allowed to use extra space. We can create a map which stores all unique array elements as the key and element frequency as the value. After populating our map, we get all the unique elements from our array. We then iterate our map and push all the keys in our input array. However, without using extra space it makes it a bit tricky as we have to modify the existing input array

One possible solution: storing each element in a sorted set, then iterate the sorted set. <br>
But complexity O(nlogn)

Two-Pointer: <br>
1st pointer is a looping pointer. 2nd pointer is insert index. <br>
The 1st element will do it anyway. Starting from 2nd element, whenever there's a unique value, we need to update value at the insert index, then index index++.





