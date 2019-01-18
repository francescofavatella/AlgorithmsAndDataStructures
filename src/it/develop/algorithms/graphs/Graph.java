package it.develop.algorithms.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
	private int V;   // No. of vertices 
    private LinkedList<Integer> adj[]; //Adjacency Lists
    
    Graph(int v){
    	V = v;
    	adj = new LinkedList[v];
    	for(int i = 0; i < v; ++i)
    		adj[i]= new LinkedList<>();
    }
    
    private void addEdge(int a, int b){
    	adj[a].add(b);
    }
    
//    Breadth First Search
    private void runBfs(int s) {
    	System.out.println("Starting Breadth First Search from vertex: "+s);
    	boolean[] isVisited = new boolean[V];
    	
    	LinkedList<Integer> queue = new LinkedList<>();
    	
    	queue.add(s);
    	while(queue.size()>0) {
    		s = queue.poll();
    		System.out.println("\t"+s);
    		isVisited[s] = true;
    		Iterator<Integer> i = adj[s].iterator();
    		while(i.hasNext()) {
    			int v = i.next();
    			if(!isVisited[v]) {
    				isVisited[v] = true;
    				queue.add(v);
    			}
    		}	
    	} 
    }
    
    private void DfsUtil(int v, boolean[] isVisited) {
    	System.out.println("\t"+v);
    	isVisited[v]=true;
    	Iterator<Integer> i = adj[v].iterator();
    	while(i.hasNext()) {
    		int s = i.next();
    		if(!isVisited[s]) {
    			DfsUtil(s, isVisited);
    		}
    	}
    }
    
//    Depth First Search
    private void runDfs(int v) {
    	System.out.println("Starting Depth First Search from vertex: "+v);
    	boolean[] isVisited = new boolean[V];
    	DfsUtil(v, isVisited);
    }
    
//    Depth First Search Modified for 
    private void runDfsModified() {
    	System.out.println("Starting Depth First Search from each vertex");
//    	Time Complexity: O(V+E) where V is number of vertices in the graph and E is number of edges in the graph.
    	boolean[] isVisited = new boolean[V];
        for (int i=0; i<V; ++i) 
            if (isVisited[i] == false) 
                DfsUtil(i, isVisited); 

    }
    
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(2,3);
        graph.addEdge(3,3);
        graph.addEdge(4,2);// unreachable node from vertex 2
        
        graph.runBfs(2);
        graph.runDfs(2);
        graph.runDfsModified();
    }
}
