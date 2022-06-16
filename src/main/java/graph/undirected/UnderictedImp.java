package graph.undirected;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnderictedImp {
    public static boolean findPathDeep(Map<String, List<String>> graph, String source, String dest, Set<String> visited) {
        if (visited.contains(source)) return false;
        if (source.equalsIgnoreCase(dest)) return true;
        List<String> neirghbors = graph.get(source);
        visited.add(source);
        for (String n : neirghbors) {
            if (findPathDeep(graph, n, dest, visited)) {
                return true;
            }
        }

        return false;
    }
}
