class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
    int[] result=new int[spells.length];
    Arrays.sort(potions);
    for(int i=0;i<spells.length;i++)
    {
        result[i]=0;
    }
    int n=potions.length;
    for(int left=0;left<spells.length;left++)
    { 
        int ans=n;
        int low=0;
        int high=n-1;
       while(low<=high)
       {
        int mid=(low+high)/2;
        long mul=(long) spells[left]*potions[mid];
        if(mul<success)low=mid+1;
        else{
        ans=mid;
        high=mid-1;
        }
      }
      result[left]=n-1-ans+1;
    }  
    return result;  
    }
}