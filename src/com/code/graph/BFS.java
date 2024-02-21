package com.code.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public boolean findBFS(List<ArrayList<Integer>> adjList, int src, int des, int V,
                           int[] pred, int[] dist) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] vist = new boolean[V+1];
        for(int i=0;i<V;i++){
            vist[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }

        vist[src] = true;
        dist[src] = 0;
        queue.add(src);

        while (!queue.isEmpty()){
            int curr = queue.remove();
            for (int i=0;i<adjList.get(curr).size();i++){
                int neighbor = adjList.get(curr).get(i);
                if(!vist[neighbor]){
                    vist[neighbor] = true;
                    dist[neighbor] = dist[curr] +1;
                    pred[neighbor] = curr;
                }
                if(neighbor==des){
                    return true;
                }
            }
        }
        return false;
    }
}
