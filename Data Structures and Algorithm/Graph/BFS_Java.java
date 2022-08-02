import java.util.*;
import java.io.*;

// BFS always gives optimal solution
public class BFS_Java {
    private int V; // number of nodes;
    private LinkedList<Integer> adj[];
    
    BFS_Java(int v) {
        V = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; i++) 
        {
            // values adding to the linkedlist
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w)
    {
        // there is an edge existing between v and w
        adj[v].add(w);
    }

    void BFS(int v)
    {
        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[v] = true;
        queue.add(v);

        while(queue.size()!= 0) 
        {
            // deleting the last value
            int temp = queue.poll();
            System.out.println(temp + " ");

            Iterator<Integer> i = adj[temp].listIterator();
            while(i.hasNext())
            {
                int n = i.next();
                while(!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int node1,node2;
        System.out.print("Enter the number of nodes : ");
        int node = sc.nextInt();

        BFS_Java g = new BFS_Java(node);

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

        g.BFS(1);

        sc.close();
    }
}
