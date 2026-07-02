import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
    for(int i=0;i<nums.length;i++)//0,1,2,3,4
    {
        if(nums[i]!=0)//0f,1,0f,3,12
        {
          nums[j]=nums[i];//[0]=1,[1]=3,[2]=12
          j++;//1,2,3
        }
    }
    for(int i=j;i<nums.length;i++)
    {
      nums[i]=0;
    }
    }
}