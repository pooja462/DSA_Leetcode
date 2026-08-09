class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int n=nums1.length;
    int m=nums2.length;
    int sum=0;
    int div=1;
    int r1=0;
    int r2=0;
    int nums[]=new int[n+m];
    int size=n+m;
    double result=0.0d;
    for(int i=0;i<n;i++)
    {
    nums[i]=nums1[i];
    } 
    for(int i=0;i<m;i++)
    {
        nums[n+i]=nums2[i];
    }
    Arrays.sort(nums);
    if(size%2!=0)
    {
    div=size/2;
    result=nums[div];
    }
if(size%2==0)
{
    div=size/2;
    r1=nums[div];
    r2=nums[div-1];
    result=(r1+r2)/2.0; 
}
    return result;
    }
}
