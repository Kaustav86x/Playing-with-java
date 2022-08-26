import java.util.*;

public class DFS_Java {

    public static void dfs(int vertex, boolean visOrNot[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> result) {
        visOrNot[vertex] = true;  // marking the starting node as visited
        result.add(vertex);  

        for(int iterator:adj.get(vertex)){ // traversing it's neighbours
            if(visOrNot[iterator] == false) { 
                dfs(iterator, visOrNot, adj, result);
            }
        }
    }

    public static ArrayList<Integer> TreeDFS(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>(); // to store the dfs
        boolean visOrNot[] = new boolean[V+1];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting : ");
        int starting_vertex = sc.nextInt();

        visOrNot[starting_vertex] = true; // as staring with this vertex

        dfs(starting_vertex, visOrNot, adj, result);

        sc.close();

        return result;
        
    }

    static void printAns(ArrayList < Integer > ans) {
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> adj = new ArrayList<>();

        // adding new arraylists to 'adj' to add neighbour nodes
        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList < > ());
        }

        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(1).add(5);
        adj.get(2).add(1);
        adj.get(2).add(4);
        adj.get(3).add(1);
        adj.get(4).add(1);
        adj.get(4).add(2);
        adj.get(5).add(1);

        ArrayList < Integer > ans = TreeDFS(5, adj);
        printAns(ans);
    }
}