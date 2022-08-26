import java.util.*;
class DFS_Java {
    public static ArrayList<Integer> TreeBFS(int v_size, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>(); // to store the final result
        Queue<Integer> q = new LinkedList< >(); // queue to add vertices
        boolean vis[] = new boolean[v_size];  // to determine whether a node is visited or not

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting index : ");
        int starting_vertex = sc.nextInt();

        q.add(starting_vertex);
        vis[starting_vertex] = true; // starting to visit from node 0

        while(!q.isEmpty()) {
            int temp = q.poll(); // pop the value from the queue (the starting node)
            result.add(temp);    // 

            for(int iterator: adj.get(temp)) {  // iterating through the neighbours of node temp
                if(vis[iterator] == false) {
                    vis[iterator] = true;  
                    q.add(iterator);     // first check then make the node visited
                }
            }
        }
        sc.close();
        return result;
    }

    public static void PrintList(ArrayList<Integer> result) {
        for(int i=0; i<result.size(); i++)
            System.out.print(result.get(i) + " "); // printing the end result
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of the graph : ");
        // int V = sc.nextInt();
        for(int i=0; i<5; i++)
            adj.add(new ArrayList<>());
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

        ArrayList<Integer> val = TreeBFS(5, adj);

        PrintList(val);

        // sc.close();
    }
}