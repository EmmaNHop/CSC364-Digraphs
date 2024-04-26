//Emma Hopkins -- CSC Program #4
// this code reads the file's data and outputs the vertices that are contacted with DFS and BFS on a digraph
import java.io.*;
import java.util.*;

public class  Driver4 {
    public static myDigraph D;
    public static Scanner inp;
    public static File f;
    public static String fName;
    public static int numVert;
    public static int numEdge;
    public static int x;
    public static int y;
    public static int w;

    public static void main(String[] args) {
        System.out.print("Please enter a path or name of input file : ");
        inp = new Scanner(System.in);
        fName = inp.nextLine();
        f = new File(fName);
        try {
            inp = new Scanner(f);
        } catch (Exception E) {
            System.out.println("File not found");
        }

        //reads number of vertices and edges
        numVert = Integer.parseInt(inp.next());
        numEdge = Integer.parseInt(inp.next());

        D = new myDigraph(numVert); //creates new digraph object

        //reading each line of vertices and weights and inputting in to the digraphs matrix
        for(int i = 0; i < numEdge; i++) {
            x = Integer.parseInt(inp.next()); //vertex 1 which points to vertex 2
            y = Integer.parseInt(inp.next()); //vertex 2
            w = Integer.parseInt(inp.next()); //weight of edge

            D.addEdge(x, y, w); //adds into matrix
        }

        //Depth first search
        System.out.println("*** DEPTH FIRST SEARCH ***");
        for (int j = 0; j < numVert ; j++ ) {
            if (!D.getVisited(j)) { //checks visited
                D.DFS(j); // this makes sure we will visit ALL vertices
            }
        }

        D.clearVisited(); // clears visited

        //Breadth first search
        System.out.println("### BREADTH FIRST SEARCH ###");
        for  (int x = 0; x <  numVert;  x++ )
            if  (  !D.getVisited(x) )
                D.BFS(x);
    }
}