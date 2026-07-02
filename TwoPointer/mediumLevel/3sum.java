import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i=0;
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        while(i<nums.length-2)
        {
            if(i>0&&nums[i]==nums[i-1])
            {i++;
            continue;}
            int left=i+1;
            int right=nums.length-1;
   while(left<right)
   {
     if(nums[i]+nums[left]+nums[right]>0)right--;
     else if(nums[i]+nums[left]+nums[right]<0)left++;
     else{
          result.add(Arrays.asList(nums[i], nums[left], nums[right]));
          left++;
          while (nums[left] == nums[left-1] && left < right) {
                        left++;
                    }
         }
   }
    i++;
        }
        return result;
    }
}