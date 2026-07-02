import java.util.*;
class Solution {
    public int maxArea(int[] height) {
    int maxwater=0;
    int left=0;
    int right=height.length-1;
    int area=0;
    while(left<right)
    {
      area=Math.min(height[left],height[right])*(right-left);
      maxwater=Math.max(area,maxwater);
      if(height[left]<height[right])left++;
      else{
        right--;
      }
    }   
    return maxwater;
    }
}
