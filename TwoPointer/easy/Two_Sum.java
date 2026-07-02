class Solution {
    public int[] twoSum(int[] nums, int target) {
       int need=0;
       int[] result=new int[2];
       HashMap<Integer, Integer> hmp=new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
          hmp.put(nums[i],i);//3-0,3-1
       } 
      for(int i=0;i<nums.length;i++)
      {
        need=target-nums[i];//6-3=3
        if(hmp.containsKey(need)&&hmp.get(need)!=i)
        { 
          result[0]=i;
          result[1]=hmp.get(need);
        }
      }
      return result;
    }
}