package graph.deepfirstsearch;

import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Dfs {
    public static void deepFirstSearch(Map<String, List<String>> graph, String source) {
        Stack<String> traversal = new Stack<>();
        traversal.push(source);

        while (!traversal.isEmpty()) {
            String currentNode = traversal.pop();
            System.out.printf("Current node %s\n", currentNode);

            List<String> neighbors = graph.get(currentNode);
            neighbors.forEach(traversal::push);
        }

    }

    public static void deepFirstSearchRecursion(Map<String, List<String>> graph, String source) {
        System.out.println(source);
        List<String> neighbors = graph.get(source);
        neighbors.forEach(neighbor -> deepFirstSearchRecursion(graph, neighbor));
    }
}
