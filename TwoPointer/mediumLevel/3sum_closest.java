import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int result=nums[0]+nums[1]+nums[2];
    int left;
    int right=nums.length-1;
    for(int i=0;i<nums.length-2;i++)
    {
        left=i+1;
        right=nums.length-1;
        while(left<right)
        {
            int sum=nums[left]+nums[right]+nums[i];
            if(Math.abs(target-sum)<Math.abs(target-result))
            {
                result=sum;
            }
            if(sum==target)return sum;
            else if(sum>target)right--;
            else{
                left++;
            }
        }
    } 
    return result;
    }
 }