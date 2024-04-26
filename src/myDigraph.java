import java.util.Arrays;

public class myDigraph {
    int[][] matrix;
    boolean[] visited;
    myQueue Q;

    public myDigraph(int numV) {
        matrix = new int[numV][numV];
        visited = new boolean[numV];
        for ( int x = 0; x < numV; x++ )
            for ( int y = 0; y<numV; y++)
                matrix[x][y] = -1;
        for (int x = 0; x <  numV; x++)
            visited[x] = false;
        Q = new myQueue();
    }

    public void addEdge(int x, int y, int w) {
        matrix[x][y] = w;
    }

    public void clearVisited() {
        for(int i = 0; i < visited.length; i++){
            visited[i] = false;
        }
    }

    public boolean getVisited(int v) {
        if(visited[v]){
            return true;
        }
        else if(!visited[v]);{
            return false;
        }
    }

    public void DFS(int v) {
        if(visited[ v ])
            return;
        visited[v] = true;
        System.out.println("Vertex " + v );
        for (int i = 0; i < matrix.length; i++ )
            if ( matrix[v][i] == 1 && !visited[i])
                DFS(i);
    }

    public void BFS( int v) {
        if (visited[v])
            return;
        int len = matrix.length;
        visited[v] = true;
        System.out.println("Vertex  "  + v );
        for ( int y = 0; y < len; y++ )
            if  ( matrix[v][y] != -1 )
                Q.enqueue(y);
        if ( !Q.isEmpty( ) )
            BFS(Q.dequeue( ));
        else
            return;
    }
}
