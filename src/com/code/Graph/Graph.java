package com.code.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Enter the number of vertices
        int vertix = scanner.nextInt();
        //Enter the number of Edge
        int edge = scanner.nextInt();

        //Create AdjacencyMatrix for Graph
        int[][] adjMatrix = new int[vertix+1][vertix+1];
//        for(int i=0;i<edge;i++){
//            int u = scanner.nextInt();
//            int v = scanner.nextInt();
//            addAdjMatrix(adjMatrix,u,v);
//        }

        //Create AdjacencyList for graph
        List<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<=vertix;i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<edge;i++){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            addAdjList(adjList,u,v);
        }
        printGraph(adjList);
    }

    private static void addAdjList(List<ArrayList<Integer>> adjList, int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    private static void addAdjMatrix(int[][] adjMatrix, int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }

    static void
    printGraph(List<ArrayList<Integer> > adj)
    {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex"
                    + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> "
                        + adj.get(i).get(j));
            }
            System.out.println();
        }
    }
}
