package graph.breathfirstsearch;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class Bfs {
    public static void bfs(Map<String, List<String>> graph, String source) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer(source);
        while (!queue.isEmpty()) {
            String poll = queue.poll();
            System.out.println(poll);
            List<String> strings = graph.get(poll);
            strings.forEach(queue::offer);
        }
    }
}
