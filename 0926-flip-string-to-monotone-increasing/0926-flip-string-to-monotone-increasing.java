/*>skip 0's until u encounter 1;
  >count number of ones in count_One(prefix)
  >any zero that comes after encounter of one can be considered for flipping keep track in flip_count;
  >if flip_count exceed count_One
  1. means number of zero exceed count of one and we need a minimum flip ;
  2. its better to flip number of one and make a function constant ;
  monotone increasing:-means always increasing or remain constant but never decreasing;
    so here flipping count_One will be better choice whenever number on zero exceed count_one;
    time complexity:-O(N)
    stack space:-O(1)
*/
class Solution {
    public int minFlipsMonoIncr(String s) {
        if(s.length()<=0||s==null)
            return 0;
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