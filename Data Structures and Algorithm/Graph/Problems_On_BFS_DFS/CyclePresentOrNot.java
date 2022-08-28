// A Java Program to detect cycle in an undirected graph
import java.util.*;
class CyclePresentOrNot {

	int V;
	// Adjacency List Representation
	LinkedList<Integer> adj[];
	// Constructor
	CyclePresentOrNot(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList<>();
	}
	void addEdge(int v, int w)
	{
		adj[v].add(w);
		adj[w].add(v);
	}
	public boolean isCyclicUtil(int v, Boolean visited[], int parent)
	{
		visited[v] = true;
		int i;
		Iterator<Integer> it = adj[v].iterator();
		while (it.hasNext()) {
			i = it.next();

			if (visited[i] == false) {
				if (isCyclicUtil(i, visited, v))
					return true;
			}
			else if (i != parent)
				return true;
		}
		return false;
	}
	public boolean isCyclic()
	{
		Boolean visited[] = new Boolean[V]; // keeping track of visited and unvisited nodes
		for (int i = 0; i < V; i++)
			visited[i] = false;
		for (int u = 0; u < V; u++) {
			if (visited[u] == false)
				if (isCyclicUtil(u, visited, -1))
					return true;
		}
		return false;
	}
	// Driver method to test above methods
	public static void main(String args[])
	{
		CyclePresentOrNot g1 = new CyclePresentOrNot(5);
		g1.addEdge(1, 0);
		g1.addEdge(0, 2);
		g1.addEdge(2, 1);
		g1.addEdge(0, 3);
		g1.addEdge(3, 4);
		if (g1.isCyclic())
			System.out.println("Graph contains cycle");
		else
			System.out.println("Graph doesn't contains cycle");

		CyclePresentOrNot g2 = new CyclePresentOrNot(3);
		g2.addEdge(0, 1);
		g2.addEdge(1, 2);
		if (g2.isCyclic())
			System.out.println("Graph contains cycle");
		else
			System.out.println("Graph doesn't contains cycle");
	}
}
