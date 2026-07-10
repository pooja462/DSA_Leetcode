class Solution {
    public List<Integer> partitionLabels(String s) {
    HashMap<Character,Integer> map=new HashMap<>();
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        map.put(ch,i);
    }
    List<Integer> part=new ArrayList<>();
    int max=0;
    int previ=0;
    for(int i=0;i<s.length();i++)
    {
     char ch=s.charAt(i);
     int last_index=map.get(ch);
     max=Math.max(max,last_index);
     if(i==max)
     {
        //partitioning
        part.add(last_index-previ+1);
        previ=max+1;
     }
    }  
    return part;
    }
}