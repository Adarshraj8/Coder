class Solution {
    public int minFlipsMonoIncr(String s) {
     //  String sp[] = s.split("");
               //char ch[] = s.toCharArray();
        int flip_count=0;
        int count_One=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                if(count_One==0){
                    continue;
                }else{
                    flip_count++;
                }
            }else{
                count_One++;
            }
             if(flip_count>count_One){
                 flip_count=count_One;
             }
        }
        return flip_count;
    }
}