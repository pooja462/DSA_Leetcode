class Solution {
    public int removeDuplicates(int[] nums) {
      int count=1;
      int i=0;
      int j=i+1;
      //1,1,2
     while(j<nums.length)//1<3,2<3,3<3f
     {
        if(j<nums.length&&nums[i]==nums[j])j++;//1<3&&1==1t=2,2<3&&1==2f
        else{
            if(i<j)i++;//0<2->1
            nums[i]=nums[j];//[1]=2
            if(j<nums.length)j++;//2<3t->3
            count++;//2
        }
     }
     return count;
    }
}