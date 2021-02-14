class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int N = graph.length;
        
        boolean[] status = new boolean[N];
        boolean[] vis = new boolean[N];
        char[] colors = new char[N];
        
        for(int i = 0; i < N; i++) status[i] = false;
        for(int i = 0; i < N; ++i) vis[i] = false;
        
        for(int I = 0; I < N; ++I) {
            if(vis[I] == false) {
                for(int i = 0; i < colors.length; ++i) colors[i] = 'G';
                
                char red = 'R', blue = 'B';
                Queue<Integer> queue = new LinkedList();
                
                queue.add(I);
                
                vis[I] = true;
                colors[I] = red;
                
                while(!queue.isEmpty()) {
                    int c_node = queue.poll();
                    int[] adj_nodes = graph[c_node];
                    char p_color = colors[c_node];
                    char c_color = (p_color == red) ? blue : red;
                    
                    for(int i = 0; i < adj_nodes.length; i++) {
                        int ch_node = adj_nodes[i];
                        
                        if(vis[ch_node] == true) {
                            if(colors[ch_node] == p_color) return false;
                        } else {
                            queue.add(ch_node);
                            vis[ch_node] = true;
                            colors[ch_node] = c_color;
                        }
                    }
                    
                }
                
            }
        }
        return true;
    }
}