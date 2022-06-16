package graph.finbiggestilendingraph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BiggestIsland {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("a", Arrays.asList("b"));
        graph.put("b", Arrays.asList("a"));
        graph.put("c", new ArrayList<>());

        graph.put("d", Arrays.asList("e", "f", "g", "h"));
        graph.put("e", Arrays.asList("d"));
        graph.put("f", Arrays.asList("d"));
        graph.put("g", Arrays.asList("d"));
        graph.put("h", Arrays.asList("d"));

        BiggestIslandImpl island = new BiggestIslandImpl();

        System.out.println(island.biggest(graph));
    }
}
