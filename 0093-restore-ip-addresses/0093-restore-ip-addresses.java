class Solution {
    public List<String> restoreIpAddresses(String s) {
       
	     List<String> l = new ArrayList<String>();
	     backtrack(l,new StringBuilder(),s,0,0);
	     return l;
    }
    public static void backtrack(List<String> l,StringBuilder currIp,String s,int pos,int numOfDots)
 {
	  if(pos==s.length()&&numOfDots==4)
	  {
		  l.add(currIp.toString());
		  return;
	  }
	  if(numOfDots==4) {
		  return;
	  }
	  for(int i=pos;i<s.length();i++)
	  {
		  String curr = s.substring(pos,i+1);
		   int val = Integer.parseInt(curr);
		   if(curr.length()>1 && curr.charAt(0)=='0')
		   {
			   return;
		   }
		   if(val>255) 
		   {
			   return;
		   }
		   if(val<=255 && val>=0)
		   {
			  StringBuilder sb = new StringBuilder(currIp);
			   currIp.append(curr);
			   if(numOfDots<3)
			   {
				   currIp.append(".");
				  }
			   backtrack(l,currIp,s,i+1,numOfDots+1);
			   currIp=sb;
		   }
	  }
 }
}