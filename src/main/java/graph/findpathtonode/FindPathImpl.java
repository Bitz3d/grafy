package graph.findpathtonode;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class FindPathImpl {
    public static boolean findPathDeep(Map<String, List<String>> graph, String source, String dest) {
        if (source.equalsIgnoreCase(dest)) return true;
        List<String> neirghbors = graph.get(source);
        for (String n : neirghbors) {
            if (findPathDeep(graph, n, dest)) {
                return true;
            }
        }

        return false;
    }

    public static boolean findPathBreath(Map<String, List<String>> graph, String source, String dest) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer(source);
        while (!queue.isEmpty()) {
            String poll = queue.poll();
            if (dest.equalsIgnoreCase(poll)) return true;
            List<String> strings = graph.get(poll);
            strings.forEach(queue::offer);
        }
        return false;
    }

}
