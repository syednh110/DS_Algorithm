package com.code.dynamicprogramming.dpontree;

import java.util.*;

class Leaderboard {
    int k;

    public Leaderboard(int k) {
        this.k = k;
    }

    Map<Integer, Integer> lb = new HashMap<>();
    PriorityQueue<NodeDP> pq = new PriorityQueue<>(Comparator.comparing(NodeDP::getSecond));

    void addScore(int playerId, int score) {
        synchronized (Leaderboard.class) {
            lb.put(playerId, score);
            if (pq.isEmpty() || pq.size() < k) {
                pq.add(new NodeDP(playerId, score));
            }
            if (!pq.isEmpty() && pq.peek().getSecond() < score && pq.size() >= k) {
                pq.poll();
                pq.add(new NodeDP(playerId, score));
            }
        }


    }

    int top(int K) {
        int sum = 0;
        for (NodeDP pair : pq) {
            sum += pair.getSecond();
        }
        return sum;
    }

    void reset(int playerId) {
        synchronized (Leaderboard.class) {
            lb.remove(playerId);

            pq.remove(new NodeDP(playerId, lb.get(playerId)));
        }
    }

    int getScore(int playerId) {
        return lb.get(playerId);
    }
}