package graph.islandCount;

class IslandCount {
    public static void main(String[] args) {
        String[][] islands = {
                {"W", "L", "W", "W", "W"},
                {"W", "L", "W", "W", "W"},
                {"W", "W", "W", "L", "W"},
                {"W", "L", "W", "L", "W"},
                {"L", "W", "W", "L", "L"},
                {"L", "L", "W", "W", "W"}
        };

        System.out.println(IslandCountImpl.numbersOfIsland(islands));
    }
}
