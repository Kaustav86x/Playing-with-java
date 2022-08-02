// import java.io.*;
import java.util.*;

public class DFS_Java {

    private int V;

    // array of type linkedlist
    private LinkedList<Integer> adj[];

    // constructor
    DFS_Java(int v) 
    {
        V = v;
        // size declaration
        adj = new LinkedList[v];
        for(int i=0; i<v; i++)
            adj[i] = new LinkedList<>();
    }

    // adding an edge

    void addEdge(int v, int w) 
    {
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean visited[]) 
    {
        visited[v] = true;
        System.out.println(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while(i.hasNext()) {
            int n = i.next();
            if(!visited[n])
                DFSUtil(n, visited);
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[V];
        // mark all the vertices as 
        // not visited
        DFSUtil(v, visited);
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int node1,node2;
        System.out.print("Enter the number of nodes : ");
        int node = sc.nextInt();

        DFS_Java g = new DFS_Java(node);

        int edge;
        System.out.print("Enter the number of edges : ");
        edge = sc.nextInt();

        // adding two nodes using edge
        for(int i=0; i<edge; i++)
        {
            System.out.print(i+1 +" th edge - ");
            node1 = sc.nextInt();
            node2 = sc.nextInt();
            g.addEdge(node1, node2);
        }

        System.out.println("Following is Depth First Traversal ");

        g.DFS(2);

        sc.close();
    }
}