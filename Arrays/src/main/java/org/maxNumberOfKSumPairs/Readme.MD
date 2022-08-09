The problem is to find the number of pairs in a given array nums such that the sum of each pair is k.
Every element can be paired with any other element only once.
For example, if nums = [3,4,3] and k = 7, we have to choose a pair in array nums with sum equal to 7. 


This problem is similar to one of the popular array problem Two Sum. 
The difference is that instead of finding indexes of the first pair with sum equal to a given value, we have to find the count of all the pairs 
with sum equal to a given value. Since we don't have to retain the original indexes of elements, it could be an advantage for us. 
We could reorder or shuffle the array elements and try to solve the problem more efficiently. (In _Approach 4, we are going to sort the 
array in increasing order).

https://leetcode.com/problems/max-number-of-k-sum-pairs/solution/