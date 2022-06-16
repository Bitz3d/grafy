package graph.undirected;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

class Undirected {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("i", Arrays.asList("j", "k"));
        graph.put("j", Arrays.asList("i"));
        graph.put("k", Arrays.asList("j", "i", "l"));
        graph.put("l", Arrays.asList("k"));
        graph.put("n", Arrays.asList("o"));
        graph.put("o", Arrays.asList("n"));


        System.out.println(UnderictedImp.findPathDeep(graph, "i", "k ", new HashSet<>()));
    }
}
