import java.util.*;
class Solution {
    public int numRescueBoats(int[] people, int limit) {
   Arrays.sort(people);
   int left=0;
   int right=people.length-1;
   int count=0;
   while(left<right)
   {
    int sum=people[left]+people[right];
    if(sum<=limit)
    {
        count++;
        left++;
        right--;
    }
    else
    {
     sum-=people[left];
        count++;
        right--;
    }
   }
   if(right==left && people[right]<=limit)count++;
   return count;
    }
}