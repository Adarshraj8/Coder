class Solution {
    
     void bfs(int src,int []dis ,int []edge,int n)
     {
         Queue<Integer> q = new LinkedList<>();
          q.add(src);
          dis[src]=0;
         while(q.size()>0)
         {
             var p = q.remove();
             if(edge[p]!=-1 && dis[edge[p]]==Integer.MAX_VALUE)
             {
                 q.add(edge[p]);
                 dis[edge[p]]=dis[p]+1;
             }
         }
     }
    public int closestMeetingNode(int[] e, int n1, int n2) {
        int n = e.length;
        int []A = new int[n];
        int []B = new int[n];
        Arrays.fill(A,Integer.MAX_VALUE);
        Arrays.fill(B,Integer.MAX_VALUE);
        
        bfs(n1,A,e,n);
        bfs(n2,B,e,n);
        
        int res = Integer.MAX_VALUE,node =-1;
         for(int i=0;i<n;i++){
        if(A[i]==Integer.MAX_VALUE || B[i]==Integer.MAX_VALUE) continue;
        if(res>Math.max(A[i],B[i])){
            node=i; 
            res= Math.max(A[i],B[i]);
        }
    }
    return node;
    }
}