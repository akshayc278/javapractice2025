import java.util.LinkedList;
import java.util.List;

public class GraphDefinations {
    class Edge {
        int src;
        int dest;
        int wgt;

        public Edge(int scr, int dest, int wgt) {
            this.src = scr;
            this.dest = dest;
            this.wgt = wgt;
        }
    }

    LinkedList<LinkedList<Edge>> adj;

    public void initiateGraph(int noOfEdges) {
        adj = new LinkedList<>();
        for (int i = 0; i < noOfEdges; i++) {
            adj.add(i, new LinkedList<Edge>());
        }
    }

    public void addEdges(List<Edge> edgeList) {
        for (int i = 0; i < edgeList.size(); i++) {
            adj.get(edgeList.get(i).src).add(edgeList.get(i));
        }
    }

    public void printGraph() {
        for (int i = 0; i < adj.size(); i++) {
            int j = 0;
            while (j < adj.get(i).size()) {
                System.out.print("Node " + adj.get(i).get(j).src + " Connected to " + adj.get(i).get(j).dest + " ");
                j++;
            }
            System.out.println();
        }
    }

    public void methodCalls() {
        Edge e1 = new Edge(0, 1, 12);
        Edge e2 = new Edge(1, 3, 13);
        Edge e3 = new Edge(3, 2, 14);
        Edge e5 = new Edge(3, 4, 14);
        Edge e4 = new Edge(4, 0, 15);
        LinkedList<Edge> inputList = new LinkedList<Edge>();
        inputList.add(e1);
        inputList.add(e2);
        inputList.add(e3);
        inputList.add(e4);
        inputList.add(e5);
        addEdges(inputList);
    }


    public static void main(String[] args) {
        int numberOfEdges = 5;
        GraphDefinations graphDefinations = new GraphDefinations();
        graphDefinations.initiateGraph(numberOfEdges);
        graphDefinations.methodCalls();
        graphDefinations.printGraph();


    }
}
