package graph.findpathtonode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FindPath {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("a", Arrays.asList("d", "b"));
        graph.put("b", Arrays.asList("c"));
        graph.put("c", new ArrayList<>());
        graph.put("d", Arrays.asList("e"));
        graph.put("e", Arrays.asList("b"));
        graph.put("f", Arrays.asList("c"));

        System.out.println(FindPathImpl.findPathBreath(graph, "a", "f"));
        System.out.println(FindPathImpl.findPathBreath(graph, "a", "c"));
        System.out.println("________________");
        System.out.println(FindPathImpl.findPathBreath(graph, "a", "f"));
        System.out.println(FindPathImpl.findPathBreath(graph, "a", "c"));

    }
}
