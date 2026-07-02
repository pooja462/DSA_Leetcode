import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
    int left=0;
    int right=nums.length-1;
    int k=nums.length-1;
    int[] arr=new int[nums.length];
    while(left<=right)
    {
        if(nums[left]*nums[left]>=nums[right]*nums[right])
        {
            arr[k]=nums[left]*nums[left];
            k--;
            left++;
        }
        else{
            arr[k]=nums[right]*nums[right];
            k--;
            right--;
        }
    }
    return arr;
    }
}
